package fr.efrei2023.asta.projet_asta.utils;

public final class LoginConstants {
    // Servlet
    public static final String SERVLET_NAME = "login";
    public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    // View
    public static final String VIEW_PATH = "/WEB-INF/jsp/login.jsp";

    // Parameter
    public static final String EMAIL_FIELD = "fieldEmail";
    public static final String PASSWORD_FIELD = "fieldPassword";

    // Attribute
    public static final String ERROR_MESSAGE_ATTRIBUTE = "errorMessage";
    public static final String ERROR_MESSAGE_VALUE_WHEN_WRONG_CREDENTIAL = "Email ou mot de passe incorrect.";
    public static final String ERROR_MESSAGE_VALUE_WHEN_USER_IS_NEITHER_APPRENTICE_OR_TUTOR = "L'utilisateur n'est ni apprenti ni tuteur, connexion impossible.";
}
