package fr.efrei2023.asta.projet_asta.servlet.log;

import fr.efrei2023.asta.projet_asta.servlet.authentication.ServletRequireUser;
import fr.efrei2023.asta.projet_asta.utils.LoginConstants;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static fr.efrei2023.asta.projet_asta.utils.LogoutConstants.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class LogoutServlet extends ServletRequireUser {

    /**
     * Get method that will invalidate clients sessions and redirect them to login servlet.
     */
    public void processUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + LoginConstants.SERVLET_PATH);
    }
}
