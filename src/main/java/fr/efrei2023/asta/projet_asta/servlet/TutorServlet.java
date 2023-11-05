package fr.efrei2023.asta.projet_asta.servlet;

import java.io.*;
import java.sql.SQLException;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import fr.efrei2023.asta.projet_asta.filter.ApprenticeFilter;
import fr.efrei2023.asta.projet_asta.model.entity.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;
import fr.efrei2023.asta.projet_asta.servlet.authentication.ServletRequireTutor;
import fr.efrei2023.asta.projet_asta.model.service.apprentice.IApprenticeService;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Tutor.*;


@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class TutorServlet extends ServletRequireTutor {
    @Inject
    private IApprenticeService _apprenticeService;

    @Override
    protected void processTutorRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var userAction = request.getParameter(ACTION_ATTRIBUTE);
        setSelectedApprenticeInSession(request);
        if (userAction != null) {
            switch (userAction) {
                case ACTION_ATTRIBUTE_VALUE_WHEN_CREATE_OR_UPDATE -> createOrUpdate(request, response);
                case ACTION_ATTRIBUTE_VALUE_WHEN_ARCHIVE -> archiveApprentice(request, response);
                case ACTION_ATTRIBUTE_VALUE_WHEN_RESET_FILTERS -> ApprenticeFilter.reset(request);
            }
            loadSessionTutor(request);
        }
        forwardTutorHomePage(request, response);
    }

    private void setSelectedApprenticeInSession(HttpServletRequest request) {
        var apprenticeMail = request.getParameter(Apprentice.EMAIL_PARAMETER);
        var apprentice = _apprenticeService.getApprenticeOrNull(apprenticeMail);
        var previousSelectedApprentice = request.getSession().getAttribute(Apprentice.SELECTED_APPRENTICE_ATTRIBUTE);
        if (apprentice == null && previousSelectedApprentice != null) {
            return;
        }
        apprentice = apprentice != null ? apprentice : new ApprenticeEntity();
        request.getSession().setAttribute(Apprentice.SELECTED_APPRENTICE_ATTRIBUTE, apprentice);
    }

    private void createOrUpdate(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute(Apprentice.SELECTED_APPRENTICE_ATTRIBUTE);
        var archivedParameter = request.getParameter(Apprentice.ARCHIVED_PARAMETER);
        var isArchivedChecked = archivedParameter != null && !archivedParameter.isEmpty();
        var requestApprentice = new ApprenticeEntity(
                getSessionTutor(),
                request.getParameter(Apprentice.EMAIL_PARAMETER),
                request.getParameter(Apprentice.FIRSTNAME_PARAMETER),
                request.getParameter(Apprentice.LASTNAME_PARAMETER),
                request.getParameter(Apprentice.PHONE_NUMBER_PARAMETER),
                request.getParameter(Apprentice.PROGRAM_PARAMETER),
                request.getParameter(Apprentice.MAJOR_PARAMETER),
                request.getParameter(Apprentice.YEAR_PARAMETER),
                isArchivedChecked
        );
        if (_apprenticeService.getApprenticeOrNull(requestApprentice.getEmail()) != null) {
            updateApprentice(request, response, requestApprentice);
        } else {
            createApprentice(request, response, requestApprentice);
        }
    }

    private void createApprentice(HttpServletRequest request, HttpServletResponse response, ApprenticeEntity apprentice) {
        try {
            _apprenticeService.createApprentice(apprentice);
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void updateApprentice(HttpServletRequest request, HttpServletResponse response, ApprenticeEntity apprentice) {
        try {
            _apprenticeService.updateApprentice(apprentice);
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void archiveApprentice(HttpServletRequest request, HttpServletResponse response) {
        var apprenticeMail = request.getParameter(Apprentice.EMAIL_PARAMETER);
        try {
            _apprenticeService.archiveApprentice(apprenticeMail);
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void forwardTutorHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var apprentices = getSessionTutor().getApprentices();
        if (apprentices == null || apprentices.isEmpty())
            request.setAttribute(EMPTY_LIST_MESSAGE_ATTRIBUTE, EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_TUTOR_HAVE_NO_APPRENTICE);
        apprentices = ApprenticeFilter.applyFromRequestOrSessionFilters(apprentices, request);
        if (apprentices == null || apprentices.isEmpty() && !getSessionTutor().getApprentices().isEmpty())
            request.setAttribute(EMPTY_LIST_MESSAGE_ATTRIBUTE, EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_FILTER_MATCH_NO_APPRENTICE);
        request.setAttribute(Apprentice.APPRENTICES_ATTRIBUTE, apprentices);
        request.getRequestDispatcher(VIEW_PATH).forward(request, response);
    }
}