package fr.efrei2023.asta.projet_asta.utils;

public final class UserConstants {
    // Attribute
    public static final String USER_ATTRIBUTE_NAME = "user";

    // Table
    public static final String TABLE_NAME = "Utilisateur";

    // Columns
    public static final String EMAIL_COLUMN_NAME = "Email";
    public static final String PASSWORD_COLUMN_NAME = "MotDePasse";
    public static final String FIRSTNAME_COLUMN_NAME = "Prenom";
    public static final String LASTNAME_COLUMN_NAME = "Nom";
    public static final String PHONE_NUMBER_COLUMN_NAME = "Tel";

    // Query
    public static final String GET_USER_BY_EMAIL_QUERY_NAME = "getUserByEmail";
    public static final String GET_USER_BY_EMAIL_QUERY = "SELECT u FROM UserEntity u WHERE u.email = :" + EMAIL_COLUMN_NAME;

}
