package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static fr.efrei2023.asta.projet_asta.utils.TutorConstants.*;


@WebServlet(name = TUTOR_SERVLET_NAME, value = TUTOR_SERVLET_PATH )
public class TutorPrototypeServlet extends SecuredServlet {
    public void doSecureGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher(TUTOR_VIEW_PATH).forward(request, response);
    }
}