package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.repository.ApprenticeSessionBean;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class ApprenticeService implements IApprenticeService {
    @EJB
    private ApprenticeSessionBean _apprenticeSessionBean;
    @Override
    public List<ApprenticeEntity> getApprenticesByTutor(String tutorMail) {
        List<ApprenticeEntity> apprentices = _apprenticeSessionBean.getApprenticesByTutor(tutorMail);
        return apprentices != null && !apprentices.isEmpty()
                ? apprentices
                : null;
    }
}
