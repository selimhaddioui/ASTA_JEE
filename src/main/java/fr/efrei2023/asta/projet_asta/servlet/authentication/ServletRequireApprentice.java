package fr.efrei2023.asta.projet_asta.servlet.authentication;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

public abstract class ServletRequireApprentice extends ServletRequireUser {
    private ApprenticeEntity sessionApprentice;

    @Override
    public final void processUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (super.getSessionUser() instanceof ApprenticeEntity) {
            sessionApprentice = (ApprenticeEntity) super.getSessionUser();
            processApprenticeRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.sendRedirect(Redirect.SERVLET_PATH);
        }
    }

    protected abstract void processApprenticeRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    protected final ApprenticeEntity getSessionApprentice() {
        return sessionApprentice;
    }
}
