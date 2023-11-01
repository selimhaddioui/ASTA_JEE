package fr.efrei2023.asta.projet_asta.utils;

public final class TutorConstants {
    // Attribute
    public static final String ACTION_ATTRIBUTE_NAME = "action";
    public static final String ACTION_ATTRIBUTE_VALUE_WHEN_CREATE = "create";
    public static final String ACTION_ATTRIBUTE_VALUE_WHEN_UPDATE = "update";
    public static final String ACTION_ATTRIBUTE_VALUE_WHEN_ARCHIVE = "archive";
    public static final String STATUS_QUERY_ATTRIBUTE_NAME = "statusQueryMessage";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_CREATE_SUCCESS = "Création réussie !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_UPDATE_SUCCESS = "Modification réussie !";
    public static final String STATUS_QUERY_ATTRIBUTE_VALUE_WHEN_ARCHIVE_SUCCESS = "Archivage réussi !";
    public static final String APPRENTICES_ATTRIBUTE_NAME = "apprentices";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_NAME = "emptyListMessage";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_TUTOR_HAVE_NO_APPRENTICE = "La liste est vide. Ajoutez au moins un(e) apprenti(e)";
    public static final String EMPTY_LIST_MESSAGE_ATTRIBUTE_VALUE_WHEN_FILTER_MATCH_NO_APPRENTICE = "Vos filtres ne correspondent à aucun apprenti. Vérifiez les.";

    // Parameters
    public static final String APPRENTICE_EMAIL_PARAMETER = "apprenticeEmail";
    public static final String APPRENTICE_FIRSTNAME_PARAMETER = "apprenticeFirstName";
    public static final String APPRENTICE_LASTNAME_PARAMETER = "apprenticeLastName";
    public static final String APPRENTICE_PROGRAM_PARAMETER = "apprenticeProgram";
    public static final String APPRENTICE_MAJOR_PARAMETER = "apprenticeMajor";
    public static final String APPRENTICE_YEAR_PARAMETER = "apprenticeYear";
    public static final String APPRENTICE_PHONE_NUMBER_PARAMETER = "apprenticePhoneNumber";
    public static final String APPRENTICE_ARCHIVED_PARAMETER = "apprenticeArchived";

    // Filters
//    public static final String ARCHIVE_FILTER_VALUE_ALL = "apprenticeEmail";
//    public static final String APPRENTICE_FIRSTNAME_PARAMETER = "apprenticeFirstName";
//    public static final String APPRENTICE_LASTNAME_PARAMETER = "apprenticeLastName";
//    public static final String APPRENTICE_PROGRAM_PARAMETER = "apprenticeProgram";
//    public static final String APPRENTICE_MAJOR_PARAMETER = "apprenticeMajor";
//    public static final String APPRENTICE_YEAR_PARAMETER = "apprenticeYear";
//    public static final String APPRENTICE_PHONE_NUMBER_PARAMETER = "apprenticePhoneNumber";
//    public static final String APPRENTICE_ARCHIVED_PARAMETER = "apprenticeArchived";

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
