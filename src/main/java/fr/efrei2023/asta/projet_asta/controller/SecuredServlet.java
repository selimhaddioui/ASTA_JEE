package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.utils.LoginConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public abstract class SecuredServlet extends HttpServlet {
    private UserEntity authenticatedUser;

    /**
     * Process a secure get only if we find a user in session's attribute.
     * Otherwise, we forward to the sign-in view.
     */
    public final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        authenticatedUser = (UserEntity) request.getSession().getAttribute(UserConstants.ATTRIBUTE_NAME_FOR_USER);
         if (authenticatedUser == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(LoginConstants.LOGIN_VIEW_PATH).forward(request, response);
        } else {
            doSecureGet(request, response);
        }
    }

    /**
     * Get method that will only be executed for authenticated users.
     */
    public abstract void doSecureGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

    protected final UserEntity getAuthenticatedUser(){
        return authenticatedUser;
    }
}