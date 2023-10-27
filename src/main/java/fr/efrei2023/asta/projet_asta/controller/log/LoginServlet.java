package fr.efrei2023.asta.projet_asta.controller.log;

import java.io.*;
import java.sql.SQLException;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.service.login.ILoginService;
import fr.efrei2023.asta.projet_asta.utils.RedirectConstants;
import fr.efrei2023.asta.projet_asta.utils.TutorConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static fr.efrei2023.asta.projet_asta.utils.LoginConstants.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class LoginServlet extends HttpServlet {
    @Inject
    private ILoginService _loginService;

    /**
     * Get method that will redirect authenticated users to their home page and non-authenticated users to sign in view.
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute(UserConstants.USER_ATTRIBUTE_NAME) != null) {
            response.sendRedirect(request.getContextPath() + RedirectConstants.SERVLET_PATH);
        } else {
            request.getRequestDispatcher(VIEW_PATH).forward(request, response);
        }
    }

    /**
     * Post method that will try to sign in users using parameter they provide in their post request.
     * If their credentials are corrects, they get redirected into their homepage.
     * Otherwise they are back to sign in page with an errorMessage attribute filled.
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            UserEntity user = _loginService.login(request.getParameter(EMAIL_FIELD), request.getParameter(PASSWORD_FIELD));
            request.getSession().setAttribute(UserConstants.USER_ATTRIBUTE_NAME, user);
            response.sendRedirect(request.getContextPath() + RedirectConstants.SERVLET_PATH);
        }catch (SQLException e){
            request.setAttribute(ERROR_MESSAGE_ATTRIBUTE_NAME, e.getMessage());
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(VIEW_PATH).forward(request, response);
        }
    }
}