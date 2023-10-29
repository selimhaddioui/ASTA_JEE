package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

@Entity
@Table(name = TABLE_NAME, schema = DatabaseConstants.SCHEMA_NAME)
@NamedQueries(
        {
                @NamedQuery(name = GET_APPRENTICE_BY_EMAIL_QUERY_NAME, query = GET_APPRENTICE_BY_EMAIL_QUERY),
//                @NamedQuery(name = INSERT_APPRENTICE_QUERY_NAME, query = INSERT_APPRENTICE_QUERY),
                @NamedQuery(name = ARCHIVE_APPRENTICE_QUERY_NAME, query = ARCHIVE_APPRENTICE_QUERY)
        }
)
public class ApprenticeEntity extends UserEntity {
    @Column(name = PROGRAM_COLUMN_NAME)
    private String program;
    @Column(name = MAJOR_COLUMN_NAME)
    private String major;
    @Column(name = YEAR_COLUMN_NAME)
    private String year;
    @Column(name = ARCHIVED_COLUMN_NAME)
    private boolean archived;

    public ApprenticeEntity() {
    }

    public ApprenticeEntity(String email,
                            String firstName,
                            String lastName,
                            String phoneNumber,
                            String program,
                            String major,
                            String year,
                            boolean archived) {
        super(email, firstName, lastName, phoneNumber);
        this.program = program;
        this.major = major;
        this.year = year;
        this.archived = archived;
    }

    public String getCompany() {
        return "NotImplementedYet";
    }

    public String getProgram() {
        return program;
    }

    public String getMajor() {
        return major;
    }

    public String getYear() {
        return year;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean isArchived) {
        this.archived = isArchived;
    }
}
