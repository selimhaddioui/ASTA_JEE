package fr.efrei2023.asta.projet_asta.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static fr.efrei2023.asta.projet_asta.utils.LoginConstants.LOGIN_SERVLET_PATH;
import static fr.efrei2023.asta.projet_asta.utils.LogoutConstants.LOGOUT_SERVLET_NAME;
import static fr.efrei2023.asta.projet_asta.utils.LogoutConstants.LOGOUT_SERVLET_PATH;

@WebServlet(name = LOGOUT_SERVLET_NAME, value = LOGOUT_SERVLET_PATH)
public class LogoutServlet extends SecuredServlet{

    /**
     * Get method that will invalidate clients sessions and redirect them to login servlet.
     */
    public void doSecureGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + LOGIN_SERVLET_PATH);
    }
}
