package fr.efrei2023.asta.projet_asta.controller.authentication;

import fr.efrei2023.asta.projet_asta.model.TutorEntity;
import fr.efrei2023.asta.projet_asta.utils.RedirectConstants;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class ServletRequireTutor extends ServletRequireUser {
    private TutorEntity sessionTutor;
    @Override
    public final void doUserGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (super.getSessionUser() instanceof TutorEntity) {
            sessionTutor = (TutorEntity) super.getSessionUser();
            doTutorGet(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.sendRedirect(RedirectConstants.SERVLET_PATH);
        }
    }

    protected abstract void doTutorGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    protected final TutorEntity getSessionTutor() {
        return sessionTutor;
    }
}
