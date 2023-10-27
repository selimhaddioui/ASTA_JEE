package fr.efrei2023.asta.projet_asta.service.login;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.repository.ApprenticeSessionBean;
import fr.efrei2023.asta.projet_asta.repository.TutorSessionBean;
import fr.efrei2023.asta.projet_asta.repository.UserSessionBean;
import fr.efrei2023.asta.projet_asta.utils.LoginConstants;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.sql.SQLException;

@Stateless
public class LoginService implements ILoginService {
    @EJB public UserSessionBean _userSessionBean;
    @EJB public ApprenticeSessionBean _apprenticeSessionBean;
    @EJB public TutorSessionBean _tutorSessionBean;

    @Override
    public UserEntity login(String login, String password) throws SQLException {
        if (login == null || login.isEmpty() || password == null || password.isEmpty())
            throw new SQLException(LoginConstants.ERROR_MESSAGE_VALUE_WHEN_WRONG_CREDENTIAL);
        UserEntity user = getUserFromApprenticeOrTutorSessionBeanOrNull(login);
        if (user != null && user.isPasswordCorrect(password))
            return user;
        UserEntity corruptedUser = _userSessionBean.getUserByEmailOrNull(login);
        if (user == null && corruptedUser != null && corruptedUser.isPasswordCorrect(password))
            throw new SQLException(LoginConstants.ERROR_MESSAGE_VALUE_WHEN_USER_IS_NEITHER_APPRENTICE_OR_TUTOR);
        throw new SQLException(LoginConstants.ERROR_MESSAGE_VALUE_WHEN_WRONG_CREDENTIAL);
    }

    private UserEntity getUserFromApprenticeOrTutorSessionBeanOrNull(String email){
        UserEntity user = _tutorSessionBean.getTutorByEmailOrNull(email);
        return user == null
                ? _apprenticeSessionBean.getApprenticeByEmailOrNull(email)
                : user;
    }
}
