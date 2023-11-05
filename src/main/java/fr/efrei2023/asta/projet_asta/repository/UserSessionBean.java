package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

@Stateless
public class UserSessionBean {
    @PersistenceContext(unitName = Database.PERSISTENCE_UNIT)
    private EntityManager entityManager;

    public UserEntity getUserByEmailOrNull(String email) {
        Query _query = entityManager.createNamedQuery(User.GET_USER_BY_EMAIL_QUERY_NAME);
        _query.setParameter(User.EMAIL_COLUMN, email);
        try {
            return (UserEntity) _query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}