package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.repository.ApprenticeSessionBean;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.sql.SQLException;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

@Stateless
public class ApprenticeService implements IApprenticeService {
    @EJB
    private ApprenticeSessionBean _apprenticeSessionBean;

    @Override
    public ApprenticeEntity getApprenticeOrNull(String email) {
        return _apprenticeSessionBean.getApprenticeByEmailOrNull(email);
    }

    @Override
    public void createApprentice(ApprenticeEntity apprentice) throws SQLException {
        try {
            _apprenticeSessionBean.createApprentice(apprentice);
        } catch (SQLException e) {
            throw new SQLException(Apprentice.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_CREATE_FAIL);
        }
    }

    @Override
    public void updateApprentice(ApprenticeEntity apprentice) throws SQLException {
        try {
            _apprenticeSessionBean.updateApprentice(apprentice);
        } catch (IllegalArgumentException e) {
            throw new SQLException(Apprentice.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_UPDATE_FAIL);
        }
    }

    @Override
    public void archiveApprentice(String email) throws SQLException {
        try {
            var apprentice = _apprenticeSessionBean.getApprenticeByEmailOrNull(email);
            if (apprentice.isArchived())
                throw new Exception();
            apprentice.setArchived(true);
            _apprenticeSessionBean.updateApprentice(apprentice);
        } catch (Exception e) {
            throw new SQLException(Apprentice.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_ARCHIVE_FAIL);
        }
    }
}
