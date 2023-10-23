package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;
import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.service.ISignInService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static fr.efrei2023.asta.projet_asta.utils.LoginConstants.*;

@WebServlet(name = LOGIN_SERVLET_NAME, value = LOGIN_SERVLET_PATH)
public class LoginServlet extends HttpServlet {
    @Inject
    private ISignInService _signInService;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute(ATTRIBUTE_NAME_FOR_USER) != null) {
            response.sendRedirect(request.getContextPath() + "/any-secure");
        } else {
            request.getRequestDispatcher(LOGIN_VIEW_PATH).forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserEntity user = _signInService.signIn(request.getParameter(EMAIL_FIELD), request.getParameter(PASSWORD_FIELD));
        if (user == null) {
            request.setAttribute(ATTRIBUTE_NAME_FOR_ERROR_MESSAGE, ATTRIBUTE_VALUE_FOR_ERROR_MESSAGE_WHEN_WRONG_CREDENTIAL);
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(LOGIN_VIEW_PATH).forward(request, response);

        } else {
            request.getSession().setAttribute(ATTRIBUTE_NAME_FOR_USER, user);
            response.sendRedirect(request.getContextPath() + "/any-secure");
        }
    }
}