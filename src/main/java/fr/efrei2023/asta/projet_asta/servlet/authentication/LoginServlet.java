package fr.efrei2023.asta.projet_asta.servlet.authentication;

import java.io.*;
import java.sql.SQLException;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import fr.efrei2023.asta.projet_asta.model.service.login.ILoginService;
import fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Login.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class LoginServlet extends HttpServlet {
    @Inject
    private ILoginService _loginService;

    /**
     * Get method that will redirect authenticated user to redirect servlet and non-authenticated user to sign in view.
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute(User.USER_ATTRIBUTE) != null) {
            response.sendRedirect(request.getContextPath() + Redirect.SERVLET_PATH);
        } else {
            request.getRequestDispatcher(VIEW_PATH).forward(request, response);
        }
    }

    /**
     * Post method that will try to sign in user using parameter he provides in request body.
     * If their credentials are corrects, they get redirected into their homepage.
     * Otherwise they are back to sign in page with an errorMessage attribute filled.
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            var user = _loginService.login(request.getParameter(EMAIL_FIELD), request.getParameter(PASSWORD_FIELD));
            request.getSession().setAttribute(User.USER_ATTRIBUTE, user);
            response.sendRedirect(request.getContextPath() + Redirect.SERVLET_PATH);
        } catch (SQLException e) {
            request.setAttribute(ERROR_MESSAGE_ATTRIBUTE, e.getMessage());
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(VIEW_PATH).forward(request, response);
        }
    }
}