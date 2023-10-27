package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;


@Stateless
public class ApprenticeSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;

    public List<ApprenticeEntity> getApprenticesByTutor(String tutorMail) {
        Query requete = entityManager.createNamedQuery(ApprenticeConstants.GET_APPRENTICES_BY_TUTOR_QUERY_NAME);
        requete.setParameter(ApprenticeConstants.TUTOR_MAIL_COLUMN_NAME, tutorMail);
        return requete.getResultList();
    }

    public ApprenticeEntity getApprenticeByEmailOrNull(String email) {
        Query requete = entityManager.createNamedQuery(ApprenticeConstants.GET_USER_APPRENTICE_BY_EMAIL_QUERY_NAME);
        requete.setParameter(UserConstants.EMAIL_COLUMN_NAME, email);
        try {
            return (ApprenticeEntity) requete.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
