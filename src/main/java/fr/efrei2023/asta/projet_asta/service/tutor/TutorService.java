package fr.efrei2023.asta.projet_asta.service.tutor;

import fr.efrei2023.asta.projet_asta.model.TutorEntity;
import fr.efrei2023.asta.projet_asta.repository.TutorSessionBean;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class TutorService implements ITutorService {
    @EJB
    private TutorSessionBean _tutorSessionBean;

    @Override
    public TutorEntity getTutorOrNull(String email) {
        return _tutorSessionBean.getTutorByEmailOrNull(email);
    }
}
