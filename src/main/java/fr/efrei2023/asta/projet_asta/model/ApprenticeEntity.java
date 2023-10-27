package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

@Entity
@Table(name = TABLE_NAME, schema = DatabaseConstants.SCHEMA_NAME)
@NamedQueries(
        {
                @NamedQuery(name = GET_APPRENTICES_BY_TUTOR_QUERY_NAME, query = GET_APPRENTICES_BY_TUTOR_QUERY),
                @NamedQuery(name = GET_USER_APPRENTICE_BY_EMAIL_QUERY_NAME, query = GET_USER_APPRENTICE_BY_EMAIL_QUERY)
        }
)
public class ApprenticeEntity extends UserEntity {
    @Basic @Column(name = TUTOR_MAIL_COLUMN_NAME)
    private String tutorMail;
    @Basic @Column(name = PROGRAM_COLUMN_NAME)
    private String program;
    @Basic @Column(name = MAJOR_COLUMN_NAME)
    private String major;
    @Basic @Column(name = YEAR_COLUMN_NAME)
    private String year;
    @Basic @Column(name = ARCHIVED_COLUMN_NAME)
    private boolean archived;

    public String getCompany() {
        return "NotImplementedYet";
    }

    public void setTutorMail(String tutorMail) {
        this.tutorMail = tutorMail;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }
}
