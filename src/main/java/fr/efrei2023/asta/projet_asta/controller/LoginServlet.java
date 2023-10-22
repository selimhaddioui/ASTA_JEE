package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;

import fr.efrei2023.asta.projet_asta.model.User;
import fr.efrei2023.asta.projet_asta.service.ISignInService;
import fr.efrei2023.asta.projet_asta.service.SignInService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static fr.efrei2023.asta.projet_asta.utils.LoginConstant.*;

@WebServlet(name = LOGIN_SERVLET_NAME, value = LOGIN_SERVLET_PATH)
public class LoginServlet extends HttpServlet {

    private ISignInService _signInService;

    public void init() {
        _signInService = new SignInService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute(ATTRIBUTE_NAME_FOR_USER) != null) {
            response.sendRedirect(request.getContextPath() + "/any-secure");
        } else {
            request.getRequestDispatcher(LOGIN_VIEW_PATH).forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = _signInService.signIn(request.getParameter(EMAIL_FIELD), request.getParameter(PASSWORD_FIELD));
        if (user == null) {
            request.setAttribute(ATTRIBUTE_NAME_FOR_ERROR_MESSAGE_WHEN_WRONG_CREDENTIAL, ERROR_MESSAGE_WHEN_WRONG_CREDENTIAL);
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(LOGIN_VIEW_PATH).forward(request, response);

        } else {
            request.getSession().setAttribute(ATTRIBUTE_NAME_FOR_USER, user);
            response.sendRedirect(request.getContextPath() + "/any-secure");
        }
    }
}