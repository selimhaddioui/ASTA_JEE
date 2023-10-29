package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;
import java.sql.SQLException;
import java.util.List;

import fr.efrei2023.asta.projet_asta.controller.authentication.ServletRequireTutor;
import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.service.apprentice.IApprenticeService;
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
        String userAction = request.getParameter(ACTION_ATTRIBUTE_NAME);
        request.removeAttribute(ACTION_ATTRIBUTE_NAME);
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
                    request.getParameter(APPRENTICE_EMAIL_PARAMETER),
                    request.getParameter(APPRENTICE_FIRSTNAME_PARAMETER),
                    request.getParameter(APPRENTICE_LASTNAME_PARAMETER),
                    request.getParameter(APPRENTICE_PROGRAM_PARAMETER),
                    request.getParameter(APPRENTICE_MAJOR_PARAMETER),
                    request.getParameter(APPRENTICE_YEAR_PARAMETER),
                    request.getParameter(APPRENTICE_PHONE_NUMBER_PARAMETER)
            );
            request.setAttribute(STATUS_QUERY_ATTRIBUTE_NAME, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE_NAME, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void updateApprentice(HttpServletRequest request, HttpServletResponse response) {
        try {
            _apprenticeService.updateApprentice(
                    request.getParameter(APPRENTICE_EMAIL_PARAMETER),
                    request.getParameter(APPRENTICE_FIRSTNAME_PARAMETER),
                    request.getParameter(APPRENTICE_LASTNAME_PARAMETER),
                    request.getParameter(APPRENTICE_PROGRAM_PARAMETER),
                    request.getParameter(APPRENTICE_MAJOR_PARAMETER),
                    request.getParameter(APPRENTICE_YEAR_PARAMETER),
                    request.getParameter(APPRENTICE_PHONE_NUMBER_PARAMETER),
                    Boolean.parseBoolean(request.getParameter(APPRENTICE_ARCHIVED_PARAMETER))
            );
            request.setAttribute(STATUS_QUERY_ATTRIBUTE_NAME, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE_NAME, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    private void archiveApprentice(HttpServletRequest request, HttpServletResponse response) {
        String apprenticeMail = request.getParameter(APPRENTICE_EMAIL_PARAMETER);
        try {
            _apprenticeService.archiveApprentice(apprenticeMail);
            request.setAttribute(STATUS_QUERY_ATTRIBUTE_NAME, STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_SUCCESS);
        } catch (SQLException e) {
            request.setAttribute(STATUS_QUERY_ATTRIBUTE_NAME, e.getMessage());
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    protected void forwardTutorHomePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ApprenticeEntity> apprentices = super.getSessionTutor().getApprentices();
        if (apprentices.isEmpty())
            request.setAttribute(EMPTY_LIST_MESSAGE_ATTRIBUTE_NAME, EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE);
        request.setAttribute(APPRENTICES_ATTRIBUTE_NAME, apprentices);
        request.getRequestDispatcher(VIEW_PATH).forward(request, response);
    }
}