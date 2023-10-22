package fr.efrei2023.asta.projet_asta.service;

import fr.efrei2023.asta.projet_asta.model.User;

public class SignInService implements ISignInService {

    @Override
    public User signIn(String login, String password) {
        if(login == null || login.isEmpty() || password == null || password.isEmpty())
            return null;
        else
            return new User(login, password);
    }
}
