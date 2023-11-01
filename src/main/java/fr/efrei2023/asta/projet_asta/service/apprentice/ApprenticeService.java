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
    public void createApprentice(String tutorEmail,
                                 String apprenticeEmail,
                                 String apprenticeFirstName,
                                 String apprenticeLastName,
                                 String apprenticeProgram,
                                 String apprenticeMajor,
                                 String apprenticeYear,
                                 String apprenticePhoneNumber) throws SQLException {
        if (tutorEmail == null || tutorEmail.isEmpty() || apprenticeEmail == null || apprenticeEmail.isEmpty()
                || !_apprenticeSessionBean.createApprentice(tutorEmail, apprenticeEmail, apprenticeFirstName, apprenticeLastName,
                apprenticePhoneNumber, apprenticeProgram, apprenticeMajor, apprenticeYear)
        )
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_CREATE_FAIL);
    }

    @Override
    public void updateApprentice(String apprenticeEmail,
                                 String apprenticeFirstName,
                                 String apprenticeLastName,
                                 String apprenticeProgram,
                                 String apprenticeMajor,
                                 String apprenticeYear,
                                 String apprenticePhoneNumber,
                                 boolean apprenticeArchived) throws SQLException {
        var apprentice = new ApprenticeEntity(
                apprenticeEmail,
                apprenticeFirstName,
                apprenticeLastName,
                apprenticePhoneNumber,
                apprenticeProgram,
                apprenticeMajor,
                apprenticeYear,
                apprenticeArchived
        );
        try {
            _apprenticeSessionBean.updateApprentice(apprentice);
        } catch (IllegalArgumentException e) {
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_UPDATE_FAIL);
        }
    }

    @Override
    public void archiveApprentice(String apprenticeEmail) throws SQLException {
        try {
            var apprentice = _apprenticeSessionBean.getApprenticeByEmailOrNull(apprenticeEmail);
            if(apprentice.isArchived())
                throw new Exception();
            apprentice.setArchived(true);
            _apprenticeSessionBean.updateApprentice(apprentice);
        } catch (Exception e) {
            throw new SQLException(ApprenticeConstants.STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_ARCHIVE_FAIL);
        }
    }
}
