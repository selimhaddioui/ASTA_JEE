package fr.efrei2023.asta.projet_asta.service.user;

import fr.efrei2023.asta.projet_asta.model.UserEntity;
import fr.efrei2023.asta.projet_asta.repository.UserSessionBean;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class UserService implements IUserService {
    @EJB
    private UserSessionBean _userSessionBean;

    @Override
    public UserEntity getUserOrNull(String email) {
        return _userSessionBean.getUserByEmailOrNull(email);
    }
}
