package fr.efrei2023.asta.projet_asta.service.user;

import fr.efrei2023.asta.projet_asta.model.UserEntity;

public interface IUserService {
    UserEntity getUserOrNull(String email);
}
