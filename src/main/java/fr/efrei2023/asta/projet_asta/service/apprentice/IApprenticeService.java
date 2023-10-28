package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;

import java.sql.SQLException;

public interface IApprenticeService {

    /**
     * Create an apprentice that will be managed by a tutor.
     */
    void createApprentice(String tutorMail, ApprenticeEntity apprentice) throws SQLException;

    void updateApprentice(ApprenticeEntity apprentice) throws SQLException;

    void archiveApprentice(String apprenticeMail) throws SQLException;
}
