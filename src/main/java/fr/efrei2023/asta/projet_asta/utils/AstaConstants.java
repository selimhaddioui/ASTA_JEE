package fr.efrei2023.asta.projet_asta.utils;

public class AstaConstants {

    public static class User {
        // Attribute
        public static final String USER_ATTRIBUTE = "user";

        // Table
        public static final String TABLE = "Utilisateur";

        // Columns
        public static final String EMAIL_COLUMN = "Email";
        public static final String PASSWORD_COLUMN = "MotDePasse";
        public static final String FIRSTNAME_COLUMN = "Prenom";
        public static final String LASTNAME_COLUMN = "Nom";
        public static final String PHONE_NUMBER_COLUMN = "Tel";

        // Query
        public static final String GET_USER_BY_EMAIL_QUERY_NAME = "getUserByEmail";
        public static final String GET_USER_BY_EMAIL_QUERY = "SELECT u FROM UserEntity u WHERE u.email = :" + EMAIL_COLUMN;
    }

    public static class Tutor {
        // Attribute
        public static final String ACTION_ATTRIBUTE = "action";
        public static final String ACTION_ATTRIBUTE_VALUE_WHEN_CREATE_OR_UPDATE = "Ajouter ou modifier un apprenti";
        public static final String ACTION_ATTRIBUTE_VALUE_WHEN_RESET_FILTERS = "Supprimer les filtres";
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
        public static final String GET_TUTOR_BY_EMAIL_QUERY = "SELECT t FROM TutorEntity t WHERE t.email = :" + User.EMAIL_COLUMN;
    }

    public static class Apprentice {
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
        public static final String JOB_COLUMN = "Mission";
        public static final String PROGRAM_COLUMN = "Programme";
        public static final String MAJOR_COLUMN = "Majeure";
        public static final String YEAR_COLUMN = "Annee";
        public static final String ARCHIVED_COLUMN = "Archiver";

        // Query
        public static final String GET_APPRENTICE_BY_EMAIL_QUERY_NAME = "getApprenticeByEmail";
        public static final String GET_APPRENTICE_BY_EMAIL_QUERY = "SELECT a FROM ApprenticeEntity a WHERE a.email = :" + User.EMAIL_COLUMN;
    }

    public static class Company {
        // Attribute
        public static final String TABLE = "Entreprise";

        // Columns
        public static final String COMPANY_NAME_COLUMN = "RaisonSocial";
        public static final String ADDRESS_COLUMN = "Adresse";
        public static final String ACCESS_INFO_COLUMN = "InfosAcces";
    }

    public static class Job {
        // Attribute
        public static final String TABLE = "Mission";

        // Columns
        public static final String COMPANY_COLUMN = "Entreprise";
        public static final String APPRENTICE_COLUMN = "Apprenti";
        public static final String DESCRIPTION_COLUMN = "Description";
        public static final String CIGREF_JOB_COLUMN = "Cigref";
        public static final String REMARK_COLUMN = "Commentaire";
    }

    public static class Visit {
        // Attribute
        public static final String TABLE = "Visite";

        // Columns
        public static final String APPRENTICE_COLUMN = "Apprenti";
        public static final String DATE_COLUMN = "Date";
        public static final String FORMAT_COLUMN = "Format";
        public static final String REMARK_COLUMN = "CompteRendu";

    }

    public static class Login {
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

    public static class Logout {
        // Servlet
        public static final String SERVLET_NAME = "logout";
        public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    }

    public static class Redirect {
        // Servlet
        public static final String SERVLET_NAME = "redirect";
        public static final String SERVLET_PATH = "/" + SERVLET_NAME;

    }

    public static class Database {
        public static final String SCHEMA = "ASTA_DB";
        public static final String PERSISTENCE_UNIT = "ASTA_PU";

    }

}
