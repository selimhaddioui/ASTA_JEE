package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

@Stateless
public class UserSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;

    public UserEntity getUserByEmailOrNull(String email) {
        Query requete = entityManager.createNamedQuery(UserConstants.GET_USER_BY_EMAIL_QUERY_NAME);
        requete.setParameter(UserConstants.EMAIL_COLUMN_NAME, email);
        try {
            return (UserEntity) requete.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}