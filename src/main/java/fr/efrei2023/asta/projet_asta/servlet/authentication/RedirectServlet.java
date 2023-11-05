package fr.efrei2023.asta.projet_asta.servlet.authentication;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import fr.efrei2023.asta.projet_asta.servlet.authentication.ServletRequireUser;
import fr.efrei2023.asta.projet_asta.model.entity.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.model.entity.TutorEntity;
import fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Redirect.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class RedirectServlet extends ServletRequireUser {
    @Override
    public void processUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        var sessionUser = super.getSessionUser();
        if (sessionUser instanceof TutorEntity) {
            response.sendRedirect(request.getContextPath() + Tutor.SERVLET_PATH);
            return;
        }
        if (sessionUser instanceof ApprenticeEntity) {
            response.sendRedirect(request.getContextPath() + Apprentice.SERVLET_PATH);
            return;
        }
        response.sendError(HttpServletResponse.SC_BAD_REQUEST);
    }
}
