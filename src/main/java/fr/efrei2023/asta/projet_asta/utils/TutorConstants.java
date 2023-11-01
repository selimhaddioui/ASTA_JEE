package fr.efrei2023.asta.projet_asta.utils;

public final class TutorConstants {
    // Attribute
    public static final String ACTION_ATTRIBUTE = "action";
    public static final String ACTION_ATTRIBUTE_VALUE_WHEN_CREATE = "create";
    public static final String ACTION_ATTRIBUTE_VALUE_WHEN_UPDATE = "update";
    public static final String ACTION_ATTRIBUTE_VALUE_WHEN_ARCHIVE = "archive";
    public static final String STATUS_QUERY_ATTRIBUTE = "statusQueryMessage";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_SUCCESS = "Création réussie !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_SUCCESS = "Modification réussie !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_SUCCESS = "Archivage réussi !";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE = "emptyListMessage";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_TUTOR_HAVE_NO_APPRENTICE = "La liste est vide. Ajoutez au moins un(e) apprenti(e)";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_FILTER_MATCH_NO_APPRENTICE = "Vos filtres ne correspondent à aucun apprenti. Vérifiez les.";

    // Servlet
    public static final String SERVLET_NAME = "tutor";
    public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    // View
    public static final String VIEW_PATH = "/WEB-INF/jsp/tutor.jsp";

    // Table
    public static final String TABLE = "Tuteur";

    // Column
    public static final String JOB_COLUMN = "Poste";
    public static final String REMARK_COLUMN = "Remarque";

    // Query
    public static final String GET_TUTOR_BY_EMAIL_QUERY_NAME = "getTutorByEmail";
    public static final String GET_TUTOR_BY_EMAIL_QUERY = "SELECT t FROM TutorEntity t WHERE t.email = :" + UserConstants.EMAIL_COLUMN;
}
