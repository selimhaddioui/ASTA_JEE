package fr.efrei2023.asta.projet_asta.servlet;

import java.io.*;
import java.sql.SQLException;

import fr.efrei2023.asta.projet_asta.filter.ApprenticeFilter;
import fr.efrei2023.asta.projet_asta.servlet.authentication.ServletRequireTutor;
import fr.efrei2023.asta.projet_asta.service.apprentice.IApprenticeService;
import fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static fr.efrei2023.asta.projet_asta.utils.TutorConstants.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class TutorServlet extends ServletRequireTutor {
    @Inject
    private IApprenticeService _apprenticeService;

    @Override
    protected void processTutorRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var userAction = request.getParameter(ACTION_ATTRIBUTE);
        request.removeAttribute(ACTION_ATTRIBUTE);
        if (userAction != null) {
            switch (userAction) {
                case ACTION_ATTRIBUTE_VALUE_WHEN_CREATE -> createApprentice(request, response);
                case ACTION_ATTRIBUTE_VALUE_WHEN_UPDATE -> updateApprentice(request, response);
                case ACTION_ATTRIBUTE_VALUE_WHEN_ARCHIVE -> archiveApprentice(request, response);
            }
            loadSessionTutor(request);
        }
        forwardTutorHomePage(request, response);
    }

    private void createApprentice(HttpServletRequest request, HttpServletResponse response) {
        try {
            _apprenticeService.createApprentice(
                    getSessionTutor().getEmail(),
                    request.getParameter(ApprenticeConstants.EMAIL_PARAMETER),
                    request.getParameter(ApprenticeConstants.FIRSTNAME_PARAMETER),
                    request.getParameter(ApprenticeConstants.LASTNAME_PARAMETER),
                    request.getParameter(ApprenticeConstants.PROGRAM_PARAMETER),
                    request.getParameter(ApprenticeConstants.MAJOR_PARAMETER),
                    request.getParameter(ApprenticeConstants.YEAR_PARAMETER),
                    request.getParameter(ApprenticeConstants.PHONE_NUMBER_PARAMETER)
            );
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void updateApprentice(HttpServletRequest request, HttpServletResponse response) {
        try {
            _apprenticeService.updateApprentice(
                    request.getParameter(ApprenticeConstants.EMAIL_PARAMETER),
                    request.getParameter(ApprenticeConstants.FIRSTNAME_PARAMETER),
                    request.getParameter(ApprenticeConstants.LASTNAME_PARAMETER),
                    request.getParameter(ApprenticeConstants.PROGRAM_PARAMETER),
                    request.getParameter(ApprenticeConstants.MAJOR_PARAMETER),
                    request.getParameter(ApprenticeConstants.YEAR_PARAMETER),
                    request.getParameter(ApprenticeConstants.PHONE_NUMBER_PARAMETER),
                    Boolean.parseBoolean(request.getParameter(ApprenticeConstants.ARCHIVED_PARAMETER))
            );
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void archiveApprentice(HttpServletRequest request, HttpServletResponse response) {
        var apprenticeMail = request.getParameter(ApprenticeConstants.EMAIL_PARAMETER);
        try {
            _apprenticeService.archiveApprentice(apprenticeMail);
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        request.getSession().setAttribute(
                ApprenticeConstants.FILTER_ARCHIVE_PARAMETER,
                request.getParameter(ApprenticeConstants.FILTER_ARCHIVE_PARAMETER)
        );
    }

    protected void forwardTutorHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var apprentices = getSessionTutor().getApprentices();
        if (apprentices == null || apprentices.isEmpty())
            request.setAttribute(EMPTY_LIST_MESSAGE_ATTRIBUTE, EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_TUTOR_HAVE_NO_APPRENTICE);
        apprentices = ApprenticeFilter.applyFromRequestFilters(apprentices, request);
        if (apprentices == null || apprentices.isEmpty() && !getSessionTutor().getApprentices().isEmpty())
            request.setAttribute(EMPTY_LIST_MESSAGE_ATTRIBUTE, EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_FILTER_MATCH_NO_APPRENTICE);
        request.setAttribute(ApprenticeConstants.APPRENTICES_ATTRIBUTE, apprentices);
        request.getRequestDispatcher(VIEW_PATH).forward(request, response);
    }
}