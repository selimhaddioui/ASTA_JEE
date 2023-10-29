package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;

import java.sql.SQLException;

public interface IApprenticeService {

    /**
     * Create an apprentice that will be managed by a tutor.
     */
    void createApprentice(String tutorEmail,
                          String apprenticeEmail,
                          String apprenticeFirstName,
                          String apprenticeLastName,
                          String apprenticeProgram,
                          String apprenticeMajor,
                          String apprenticeYear,
                          String apprenticePhoneNumber) throws SQLException;

    void updateApprentice(String apprenticeEmail,
                          String apprenticeFirstName,
                          String apprenticeLastName,
                          String apprenticeProgram,
                          String apprenticeMajor,
                          String apprenticeYear,
                          String apprenticePhoneNumber,
                          boolean apprenticeArchived) throws SQLException;

    void archiveApprentice(String apprenticeEmail) throws SQLException;
}
