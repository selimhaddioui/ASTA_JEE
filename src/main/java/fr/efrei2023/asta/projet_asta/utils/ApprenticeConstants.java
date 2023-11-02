package fr.efrei2023.asta.projet_asta.utils;

public final class ApprenticeConstants {
    // Attribute
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_CREATE_FAIL = "Echec de la création";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_UPDATE_FAIL = "Echec de la modification";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_APPRENTICE_ARCHIVE_FAIL = "Echec de l'archivage";
    public static final String APPRENTICES_ATTRIBUTE = "apprentices";
    public static final String SELECTED_APPRENTICE_ATTRIBUTE = "selectedApprentice";

    // Parameter
    public static final String EMAIL_PARAMETER = "apprenticeEmail";
    public static final String FIRSTNAME_PARAMETER = "apprenticeFirstName";
    public static final String LASTNAME_PARAMETER = "apprenticeLastName";
    public static final String PROGRAM_PARAMETER = "apprenticeProgram";
    public static final String MAJOR_PARAMETER = "apprenticeMajor";
    public static final String YEAR_PARAMETER = "apprenticeYear";
    public static final String PHONE_NUMBER_PARAMETER = "apprenticePhoneNumber";
    public static final String ARCHIVED_PARAMETER = "apprenticeArchived";

    // Filters
    public static final String FILTER_ARCHIVE_PARAMETER = "archiveFilter";
    public static final String FILTER_ARCHIVE_VALUE_ALL_APPRENTICES = "Tous";
    public static final String FILTER_ARCHIVE_VALUE_ONLY_ARCHIVED_APPRENTICES = "Archivé";
    public static final String FILTER_ARCHIVE_VALUE_APPRENTICES_NOT_ARCHIVED = "Non archivé";
    public static final String FILTER_FIRSTNAME_PARAMETER = "firstNameFilter";
    public static final String FILTER_LASTNAME_PARAMETER = "lastNameFilter";
    public static final String FILTER_PROGRAM_PARAMETER = "programFilter";
    public static final String FILTER_MAJOR_PARAMETER = "majorFilter";
    public static final String FILTER_YEAR_PARAMETER = "yearFilter";
    public static final String FILTER_PHONE_NUMBER_PARAMETER = "phoneNumberFilter";

    // Servlet
    public static final String SERVLET_NAME = "apprenti";
    public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    // View
    public static final String VIEW_PATH = "/WEB-INF/jsp/apprenti.jsp";
    // Table
    public static final String TABLE = "Apprenti";

    // Columns
    public static final String TUTOR_COLUMN = "EmailTuteur";
    public static final String PROGRAM_COLUMN = "Programme";
    public static final String MAJOR_COLUMN = "Majeure";
    public static final String YEAR_COLUMN = "Annee";
    public static final String ARCHIVED_COLUMN = "Archiver";

    // Query
    public static final String GET_APPRENTICE_BY_EMAIL_QUERY_NAME = "getApprenticeByEmail";
    public static final String GET_APPRENTICE_BY_EMAIL_QUERY = "SELECT a FROM ApprenticeEntity a WHERE a.email = :" + UserConstants.EMAIL_COLUMN;
}
