package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.repository.ApprenticeSessionBean;
import fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.sql.SQLException;

@Stateless
public class ApprenticeService implements IApprenticeService {
    @EJB
    private ApprenticeSessionBean _apprenticeSessionBean;

    @Override
    public void createApprentice(String tutorMail, ApprenticeEntity apprentice) throws SQLException {
        if (tutorMail == null || tutorMail.isEmpty() || apprentice == null
                || apprentice.getEmail() == null || apprentice.getEmail().isEmpty()
                || !_apprenticeSessionBean.createApprentice(tutorMail, apprentice))
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_FAIL);
    }

    @Override
    public void updateApprentice(ApprenticeEntity apprentice) throws SQLException {
        if (apprentice == null || apprentice.getEmail() == null || apprentice.getEmail().isEmpty()
                || !_apprenticeSessionBean.updateApprentice(apprentice))
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_FAIL);
    }

    @Override
    public void archiveApprentice(String apprenticeMail) throws SQLException {
        if (apprenticeMail == null || apprenticeMail.isEmpty()
                || !_apprenticeSessionBean.archiveApprentice(apprenticeMail))
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_FAIL);
    }
}
