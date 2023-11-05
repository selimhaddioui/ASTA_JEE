package fr.efrei2023.asta.projet_asta.servlet.authentication;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import fr.efrei2023.asta.projet_asta.servlet.authentication.ServletRequireUser;
import fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Logout.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class LogoutServlet extends ServletRequireUser {

    public void processUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + Login.SERVLET_PATH);
    }
}
