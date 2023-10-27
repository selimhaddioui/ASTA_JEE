package fr.efrei2023.asta.projet_asta.controller.authentication;

import java.io.*;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.utils.LoginConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public abstract class ServletRequireUser extends HttpServlet {
    private UserEntity sessionUser;

    /**
     * Process a secure get only if we find a user in session's attribute.
     * Otherwise, we forward to the sign-in view.
     */
    public final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        sessionUser = (UserEntity) request.getSession().getAttribute(UserConstants.USER_ATTRIBUTE_NAME);
        if (sessionUser == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(LoginConstants.VIEW_PATH).forward(request, response);
        } else {
            doUserGet(request, response);
        }
    }

    /**
     * Get method that will only be executed for authenticated users.
     */
    public abstract void doUserGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

    protected final UserEntity getSessionUser() {
        return sessionUser;
    }
}