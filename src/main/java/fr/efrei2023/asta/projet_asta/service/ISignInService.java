package fr.efrei2023.asta.projet_asta.service;

import fr.efrei2023.asta.projet_asta.model.User;

public interface ISignInService {
    /**
     * Get the user that have a matching login if it exist and the password is correct .
     * Return null otherwise.
     */
    User signIn(String login, String password);
}
