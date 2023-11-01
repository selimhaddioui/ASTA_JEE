package fr.efrei2023.asta.projet_asta.utils;

public final class UserConstants {
    // Attribute
    public static final String USER_ATTRIBUTE = "user";

    // Table
    public static final String TABLE = "Utilisateur";

    // Columns
    public static final String EMAIL_COLUMN = "Email";
    public static final String PASSWORD_COLUMN = "MotDePasse";
    public static final String FIRSTNAME_COLUMN = "Prenom";
    public static final String LASTNAME_COLUMN = "Nom";
    public static final String PHONE_NUMBER_COLUMN = "Tel";

    // Query
    public static final String GET_USER_BY_EMAIL_QUERY_NAME = "getUserByEmail";
    public static final String GET_USER_BY_EMAIL_QUERY = "SELECT u FROM UserEntity u WHERE u.email = :" + EMAIL_COLUMN;

}
