package fr.efrei2023.asta.projet_asta.model.service.user;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import fr.efrei2023.asta.projet_asta.model.entity.UserEntity;
import fr.efrei2023.asta.projet_asta.model.sessionbean.UserSessionBean;

@Stateless
public class UserService implements IUserService {
    @EJB
    private UserSessionBean _userSessionBean;

    @Override
    public UserEntity getUserOrNull(String email) {
        return _userSessionBean.getUserByEmailOrNull(email);
    }
}
