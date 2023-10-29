package fr.efrei2023.asta.projet_asta.service.login;

import fr.efrei2023.asta.projet_asta.model.UserEntity;

import java.sql.SQLException;

public interface ILoginService {
    /**
     * Get the user that have a matching login if it exist and the password is correct.
     * Otherwise throw an SQLException..
     */
    UserEntity login(String login, String password) throws SQLException;
    /**
     * Get the user that have a matching login if it exist and the password is correct.
     * Otherwise throw an SQLException..
     */
    UserEntity getUserFromApprenticeOrTutorSessionBeanOrNull(String email);
}
