package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.TutorEntity;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;


import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

@Stateless
public class TutorSessionBean {
    @PersistenceContext(unitName = Database.PERSISTENCE_UNIT)
    private EntityManager _entityManager;

    public TutorEntity getTutorByEmailOrNull(String email) {
        var query = _entityManager.createNamedQuery(Tutor.GET_TUTOR_BY_EMAIL_QUERY_NAME);
        query.setParameter(User.EMAIL_COLUMN, email);
        try {
            return (TutorEntity) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
