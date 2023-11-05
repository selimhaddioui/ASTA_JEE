package fr.efrei2023.asta.projet_asta.model.service.apprentice;

import java.sql.SQLException;

import fr.efrei2023.asta.projet_asta.model.entity.ApprenticeEntity;

public interface IApprenticeService {

    ApprenticeEntity getApprenticeOrNull(String email);

    void createApprentice(ApprenticeEntity apprentice) throws SQLException;

    void updateApprentice(ApprenticeEntity apprentice) throws SQLException;

    void archiveApprentice(String eEmail) throws SQLException;
}
