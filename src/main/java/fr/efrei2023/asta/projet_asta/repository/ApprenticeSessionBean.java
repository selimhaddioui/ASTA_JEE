package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

@Stateless
public class ApprenticeSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;

    public List<ApprenticeEntity> getApprenticesByTutor(String tutorMail) {
        Query requete = entityManager.createNamedQuery(GET_APPRENTICE_BY_TUTOR_QUERY_NAME);
        requete.setParameter(TUTOR_MAIL_COLUMN_NAME, tutorMail);
        return requete.getResultList();
    }
}
