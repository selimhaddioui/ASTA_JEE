package fr.efrei2023.asta.projet_asta.utils;

public final class ApprenticeConstants {
    // Table
    public static final String APPRENTICE_TABLE_NAME = "Apprenti";

    // Columns
    public static final String TUTOR_MAIL_COLUMN_NAME = "EmailTuteur";
    public static final String PROGRAM_COLUMN_NAME = "Programme";
    public static final String MAJOR_COLUMN_NAME = "Majeure";
    public static final String YEAR_COLUMN_NAME = "Annee";
    public static final String ARCHIVED_COLUMN_NAME = "Archiver";

    // Query
    public static final String GET_APPRENTICE_BY_TUTOR_QUERY_NAME = "getApprenticesByTutor";
    public static final String GET_APPRENTICE_BY_TUTOR_QUERY = "SELECT a FROM ApprenticeEntity a WHERE a.tutorMail = :" + TUTOR_MAIL_COLUMN_NAME;
}
