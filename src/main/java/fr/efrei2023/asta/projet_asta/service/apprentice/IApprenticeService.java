package fr.efrei2023.asta.projet_asta.service.apprentice;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;

import java.sql.SQLException;

public interface IApprenticeService {

    ApprenticeEntity getApprenticeOrNull(String email);

    void createApprentice(ApprenticeEntity apprentice) throws SQLException;

    void updateApprentice(ApprenticeEntity apprentice) throws SQLException;

    void archiveApprentice(String eEmail) throws SQLException;
}
