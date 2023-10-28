package fr.efrei2023.asta.projet_asta.utils;

public final class ApprenticeConstants {
    // Attribute
    public static final String STATUS_QUERY_ATTRIBUTE_NAME = "statusQueryMessage";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_SUCCESS = "Création réussie !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_SUCCESS = "Modification réussie !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_SUCCESS = "Archivage réussi !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_FAIL = "Echec de la création";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_FAIL = "Echec de la modification";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_FAIL = "Echec de l'archivage";
    // Servlet
    public static final String SERVLET_NAME = "apprenti";
    public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    // View
    public static final String VIEW_PATH = "/WEB-INF/jsp/apprenti.jsp";
    // Table
    public static final String TABLE_NAME = "Apprenti";

    // Columns
    public static final String TUTOR_COLUMN_NAME = "EmailTuteur";
    public static final String PROGRAM_COLUMN_NAME = "Programme";
    public static final String MAJOR_COLUMN_NAME = "Majeure";
    public static final String YEAR_COLUMN_NAME = "Annee";
    public static final String ARCHIVED_COLUMN_NAME = "Archiver";

    // Query
    public static final String GET_APPRENTICE_BY_EMAIL_QUERY_NAME = "getApprenticeByEmail";
    public static final String GET_APPRENTICE_BY_EMAIL_QUERY = "SELECT a FROM ApprenticeEntity a WHERE a.email = :" + UserConstants.EMAIL_COLUMN_NAME;
    public static final String INSERT_APPRENTICE_QUERY_NAME = "insertApprentice";
    public static final String INSERT_APPRENTICE_QUERY = "#TODO"; // #TODO
    public static final String ARCHIVE_APPRENTICE_QUERY_NAME = "archiveApprentice";
    public static final String ARCHIVE_APPRENTICE_QUERY = "UPDATE ApprenticeEntity SET archived = true WHERE email=:" + UserConstants.EMAIL_COLUMN_NAME;
    public static final String UPDATE_APPRENTICE_QUERY_NAME = "updateApprentice";
    public static final String UPDATE_APPRENTICE_QUERY = "#TODO";
}
