package fr.efrei2023.asta.projet_asta.controller.authentication;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.utils.RedirectConstants;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class ServletRequireApprentice extends ServletRequireUser {
    private ApprenticeEntity sessionApprentice;
    @Override
    public final void doUserGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (super.getSessionUser() instanceof ApprenticeEntity) {
            sessionApprentice = (ApprenticeEntity) super.getSessionUser();
            doApprenticeGet(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.sendRedirect(RedirectConstants.SERVLET_PATH);
        }
    }

    protected abstract void doApprenticeGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    protected final ApprenticeEntity getSessionTutor() {
        return sessionApprentice;
    }
}
