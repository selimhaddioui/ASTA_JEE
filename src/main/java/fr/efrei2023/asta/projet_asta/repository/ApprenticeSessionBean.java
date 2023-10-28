package fr.efrei2023.asta.projet_asta.repository;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import fr.efrei2023.asta.projet_asta.utils.UserConstants;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

@Stateless
public class ApprenticeSessionBean {
    @PersistenceContext(unitName = DatabaseConstants.PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;
    private Query requete;

    public ApprenticeEntity getApprenticeByEmailOrNull(String email) {
        requete = entityManager.createNamedQuery(GET_APPRENTICE_BY_EMAIL_QUERY_NAME);
        requete.setParameter(UserConstants.EMAIL_COLUMN_NAME, email);
        try {
            return (ApprenticeEntity) requete.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean createApprentice(String tutorEmail, ApprenticeEntity apprentice) {
//        requete = entityManager.createNamedQuery(INSERT_APPRENTICE_QUERY_NAME);
//        requete.setParameter(UserConstants.EMAIL_COLUMN_NAME, apprentice.getEmail());
//        requete.setParameter(PROGRAM_COLUMN_NAME, apprentice.getProgram());
//        requete.setParameter(MAJOR_COLUMN_NAME, apprentice.getMajor());
//        requete.setParameter(YEAR_COLUMN_NAME, apprentice.getYear());
//        requete.setParameter(TUTOR_COLUMN_NAME,tutorEmail);
        // Ajouter tt les champs #TODO
        return requete.executeUpdate() == 1;
    }

    public boolean updateApprentice(ApprenticeEntity apprentice) {
//        requete = entityManager.createNamedQuery(ARCHIVE_APPRENTICE_QUERY_NAME);
        // #TODO
        return requete.executeUpdate() == 1;
    }

    public boolean archiveApprentice(String apprenticeMail) {
        requete = entityManager.createNamedQuery(ARCHIVE_APPRENTICE_QUERY_NAME);
        requete.setParameter(UserConstants.EMAIL_COLUMN_NAME, apprenticeMail);
        return requete.executeUpdate() == 1;
    }
}
