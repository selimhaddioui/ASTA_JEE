package fr.efrei2023.asta.projet_asta.service.login;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.repository.UserSessionBean;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class LoginService implements ILoginService {
    @EJB
    public UserSessionBean _userSessionBean;

    @Override
    public UserEntity login(String login, String password) {
        if(login == null || login.isEmpty() || password == null || password.isEmpty())
            return null;
        UserEntity user = _userSessionBean.getUserByEmailOrNull(login);
        return user != null && user.isPasswordCorrect(password) ? user : null;
    }
}
