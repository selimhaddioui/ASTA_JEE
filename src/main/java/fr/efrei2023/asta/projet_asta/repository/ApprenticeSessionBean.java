package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

import java.sql.SQLException;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

@Stateless
public class ApprenticeSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT)
    private EntityManager _entityManager;

    public ApprenticeEntity getApprenticeByEmailOrNull(String email) {
        Query _query = _entityManager.createNamedQuery(GET_APPRENTICE_BY_EMAIL_QUERY_NAME);
        _query.setParameter(UserConstants.EMAIL_COLUMN, email);
        try {
            return (ApprenticeEntity) _query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public void createApprentice(ApprenticeEntity apprentice) throws SQLException {
        try {
            _entityManager.persist(apprentice);
        } catch (EntityExistsException e) {
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_CREATE_FAIL);
        }
    }

    public void updateApprentice(ApprenticeEntity apprentice) {
        _entityManager.merge(apprentice);
    }
}
