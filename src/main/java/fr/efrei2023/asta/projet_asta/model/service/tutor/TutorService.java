package fr.efrei2023.asta.projet_asta.model.service.tutor;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import fr.efrei2023.asta.projet_asta.model.entity.TutorEntity;
import fr.efrei2023.asta.projet_asta.model.sessionbean.TutorSessionBean;

@Stateless
public class TutorService implements ITutorService {
    @EJB
    private TutorSessionBean _tutorSessionBean;

    @Override
    public TutorEntity getTutorOrNull(String email) {
        return _tutorSessionBean.getTutorByEmailOrNull(email);
    }
}
