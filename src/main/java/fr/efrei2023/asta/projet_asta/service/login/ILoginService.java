package fr.efrei2023.asta.projet_asta.service.login;

import fr.efrei2023.asta.projet_asta.model.UserEntity;

public interface ILoginService {
    /**
     * Get the user that have a matching login if it exist and the password is correct.
     * Return null otherwise.
     */
    UserEntity login(String login, String password);
}
