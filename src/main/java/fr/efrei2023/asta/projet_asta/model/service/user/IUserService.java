package fr.efrei2023.asta.projet_asta.model.service.user;

import fr.efrei2023.asta.projet_asta.model.entity.UserEntity;

public interface IUserService {
    UserEntity getUserOrNull(String email);
}
