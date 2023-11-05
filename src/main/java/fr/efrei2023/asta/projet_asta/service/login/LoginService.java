package fr.efrei2023.asta.projet_asta.service.login;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.service.apprentice.IApprenticeService;
import fr.efrei2023.asta.projet_asta.service.tutor.ITutorService;
import fr.efrei2023.asta.projet_asta.service.user.IUserService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.sql.SQLException;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.*;

@Stateless
public class LoginService implements ILoginService {
    @Inject
    public IUserService _userService;
    @Inject
    public IApprenticeService _apprenticeService;
    @Inject
    public ITutorService _tutorService;

    @Override
    public UserEntity login(String login, String password) throws SQLException {
        if (login == null || login.isEmpty() || password == null || password.isEmpty())
            throw new SQLException(Login.ERROR_MESSAGE_VALUE_WHEN_WRONG_CREDENTIAL);
        var user = getUserFromApprenticeOrTutorSessionBean(login);
        if (user != null && user.isPasswordCorrect(password))
            return user;
        var corruptedUser = _userService.getUserOrNull(login);
        if (user == null && corruptedUser != null && corruptedUser.isPasswordCorrect(password))
            throw new SQLException(Login.ERROR_MESSAGE_VALUE_WHEN_USER_IS_NEITHER_APPRENTICE_OR_TUTOR);
        throw new SQLException(Login.ERROR_MESSAGE_VALUE_WHEN_WRONG_CREDENTIAL);
    }

    @Override
    public UserEntity getUserFromApprenticeOrTutorSessionBean(String email) {
        var user = _tutorService.getTutorOrNull(email);
        return user == null
                ? _apprenticeService.getApprenticeOrNull(email)
                : user;
    }
}
