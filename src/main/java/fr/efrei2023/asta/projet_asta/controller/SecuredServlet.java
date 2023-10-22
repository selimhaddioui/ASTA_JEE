package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public abstract class SecuredServlet extends HttpServlet {

    public final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute("user") == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        } else {
            doSecureGet(request, response);
        }
    }

    public abstract void doSecureGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}