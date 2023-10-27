package fr.efrei2023.asta.projet_asta.utils;

public final class TutorConstants {
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
    public static final String GET_USER_TUTOR_BY_EMAIL_QUERY_NAME = "getUserTutorByEmail";
    public static final String GET_USER_TUTOR_BY_EMAIL_QUERY =
            "SELECT t FROM TutorEntity t " +
                    "INNER JOIN UserEntity u " +
                    "ON t.email=u.email " +
                    "WHERE u.email = :" + UserConstants.EMAIL_COLUMN_NAME;
}
