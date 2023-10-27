package fr.efrei2023.asta.projet_asta.utils;

import java.util.Locale;

public final class ApprenticeConstants {
    // Servlet
    public static final String SERVLET_NAME = "apprenti";
    public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    // View
    public static final String VIEW_PATH = "/WEB-INF/jsp/apprenti.jsp";
    // Table
    public static final String TABLE_NAME = "Apprenti";

    // Columns
    public static final String TUTOR_MAIL_COLUMN_NAME = "EmailTuteur";
    public static final String PROGRAM_COLUMN_NAME = "Programme";
    public static final String MAJOR_COLUMN_NAME = "Majeure";
    public static final String YEAR_COLUMN_NAME = "Annee";
    public static final String ARCHIVED_COLUMN_NAME = "Archiver";

    // Query
    public static final String GET_APPRENTICES_BY_TUTOR_QUERY_NAME = "getApprenticesByTutor";
    public static final String GET_APPRENTICES_BY_TUTOR_QUERY = "SELECT a FROM ApprenticeEntity a WHERE a.tutorMail = :" + TUTOR_MAIL_COLUMN_NAME;
    public static final String GET_USER_APPRENTICE_BY_EMAIL_QUERY_NAME = "getUserApprenticeByEmail";
    public static final String GET_USER_APPRENTICE_BY_EMAIL_QUERY =
            "SELECT a FROM ApprenticeEntity a " +
                    "INNER JOIN UserEntity u " +
                    "ON a.email=u.email " +
                    "WHERE u.email = :" + UserConstants.EMAIL_COLUMN_NAME;
}
