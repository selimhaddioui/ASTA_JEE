package fr.efrei2023.asta.projet_asta.controller;

import fr.efrei2023.asta.projet_asta.controller.authentication.ServletRequireApprentice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class ApprenticeServlet extends ServletRequireApprentice {
    @Override
    protected void processApprenticeRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(VIEW_PATH).forward(request, response);
    }
}
