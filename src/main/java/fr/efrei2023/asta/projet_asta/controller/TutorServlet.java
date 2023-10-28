package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;
import java.util.List;

import fr.efrei2023.asta.projet_asta.controller.authentication.ServletRequireTutor;
import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static fr.efrei2023.asta.projet_asta.utils.TutorConstants.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class TutorServlet extends ServletRequireTutor {
    @Override
    protected void doTutorGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ApprenticeEntity> apprentices = super.getSessionTutor().getApprentices();
        if (apprentices.isEmpty())
            request.setAttribute(EMPTY_LIST_MESSAGE_ATTRIBUTE_NAME, EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE);
        request.setAttribute(APPRENTICES_ATTRIBUTE_NAME, apprentices);
        request.getRequestDispatcher(VIEW_PATH).forward(request, response);
    }
}