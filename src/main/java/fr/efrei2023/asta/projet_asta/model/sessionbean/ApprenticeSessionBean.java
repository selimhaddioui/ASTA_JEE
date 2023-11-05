package fr.efrei2023.asta.projet_asta.model.sessionbean;

import java.sql.SQLException;

import jakarta.ejb.Stateless;
import jakarta.persistence.*;

import fr.efrei2023.asta.projet_asta.model.entity.ApprenticeEntity;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

@Stateless
public class ApprenticeSessionBean {
    @PersistenceContext(unitName = Database.PERSISTENCE_UNIT)
    private EntityManager _entityManager;

    public ApprenticeEntity getApprenticeByEmailOrNull(String email) {
        Query _query = _entityManager.createNamedQuery(Apprentice.GET_APPRENTICE_BY_EMAIL_QUERY_NAME);
        _query.setParameter(User.EMAIL_COLUMN, email);
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
            throw new SQLException(Apprentice.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_CREATE_FAIL);
        }
    }

    public void updateApprentice(ApprenticeEntity apprentice) {
        _entityManager.merge(apprentice);
    }
}
