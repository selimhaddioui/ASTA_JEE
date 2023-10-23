package fr.efrei2023.asta.projet_asta.utils;

import fr.efrei2023.asta.projet_asta.model.UserEntity;

public final class UserConstants {
    // Table
    public static final String USER_TABLE_NAME = "Utilisateur";
    public static final String USER_ENTITY_CLASS_NAME = "UserEntity";

    // Columns
    public static final String ID_COLUMN_NAME = "ID_User";
    public static final String EMAIL_COLUMN_NAME = "Email";
    public static final String PASSWORD_COLUMN_NAME = "MotDePasse";
    public static final String FIRSTNAME_COLUMN_NAME = "Prenom";
    public static final String LASTNAME_COLUMN_NAME = "Nom";
    public static final String PHONE_NUMBER_COLUMN_NAME = "Tel";

    // Query
    public static final String GET_USER_BY_EMAIL_QUERY_NAME = "getUserByEmail";
    public static final String GET_USER_BY_EMAIL_QUERY = "SELECT u FROM " + USER_ENTITY_CLASS_NAME + " u WHERE u.email = :" + EMAIL_COLUMN_NAME;

}
