package fr.efrei2023.asta.projet_asta.servlet.authentication;

import java.io.*;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.service.login.ILoginService;
import fr.efrei2023.asta.projet_asta.utils.LoginConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public abstract class ServletRequireUser extends HttpServlet {
    @Inject
    private ILoginService _loginService;
    private UserEntity sessionUser;

    public final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        processSecureRequest(request, response);
    }

    public final void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        processSecureRequest(request, response);
    }

    /**
     * Process request if we find an authenticated user in session's attribute.
     * Otherwise, we forward to the sign-in view.
     */
    public final void processSecureRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        sessionUser = (UserEntity) request.getSession().getAttribute(UserConstants.USER_ATTRIBUTE);
        if (sessionUser == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher(LoginConstants.VIEW_PATH).forward(request, response);
        } else {
            processUserRequest(request, response);
        }
    }

    protected final void loadSessionUser(HttpServletRequest request) {
        sessionUser = _loginService.getUserFromApprenticeOrTutorSessionBean(sessionUser.getEmail());
        request.getSession().setAttribute(UserConstants.USER_ATTRIBUTE, sessionUser);
    }

    /**
     * Request to process when we user is authorized to.
     */
    public abstract void processUserRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    protected final UserEntity getSessionUser() {
        return sessionUser;
    }
}