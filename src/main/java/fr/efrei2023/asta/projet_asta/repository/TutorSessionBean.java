package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.TutorEntity;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import fr.efrei2023.asta.projet_asta.utils.TutorConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;

@Stateless
public class TutorSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT)
    private EntityManager _entityManager;

    public TutorEntity getTutorByEmailOrNull(String email) {
        var query = _entityManager.createNamedQuery(TutorConstants.GET_TUTOR_BY_EMAIL_QUERY_NAME);
        query.setParameter(UserConstants.EMAIL_COLUMN, email);
        try {
            return (TutorEntity) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
