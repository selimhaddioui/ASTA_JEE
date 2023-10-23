package fr.efrei2023.asta.projet_asta.repository;


import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;


import static fr.efrei2023.asta.projet_asta.utils.UserConstants.*;

@Stateless
public class UserSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;

    public UserEntity getUserByEmail(String email) {
        Query requete = entityManager.createNamedQuery(GET_USER_BY_EMAIL_QUERY_NAME);
        requete.setParameter(EMAIL_COLUMN_NAME, email);
        return (UserEntity) requete.getSingleResult();
    }
}