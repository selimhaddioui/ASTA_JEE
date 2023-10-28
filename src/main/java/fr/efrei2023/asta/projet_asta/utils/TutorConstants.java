package fr.efrei2023.asta.projet_asta.utils;

public final class TutorConstants {
    // Attribute
    public static final String APPRENTICES_ATTRIBUTE_NAME = "apprentices";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_NAME = "emptyListMessage";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE = "La liste est vide. Ajoutez au moins un(e) apprenti(e)";

    // Servlet
    public static final String SERVLET_NAME = "tutor";
    public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    // View
    public static final String VIEW_PATH = "/WEB-INF/jsp/tutor.jsp";

    // Table
    public static final String TABLE_NAME = "Tuteur";

    // Column
    public static final String JOB_COLUMN_NAME = "Poste";
    public static final String REMARK_COLUMN_NAME = "Remarque";

    // Query
    public static final String GET_TUTOR_BY_EMAIL_QUERY_NAME = "getTutorByEmail";
    public static final String GET_TUTOR_BY_EMAIL_QUERY = "SELECT t FROM TutorEntity t WHERE t.email = :" + UserConstants.EMAIL_COLUMN_NAME;
}
