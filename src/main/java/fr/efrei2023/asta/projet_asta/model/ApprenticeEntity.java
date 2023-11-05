package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.AstaConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Apprentice.*;

@Entity
@Table(name = TABLE, schema = AstaConstants.Database.SCHEMA)
@NamedQueries(
        {
                @NamedQuery(name = GET_APPRENTICE_BY_EMAIL_QUERY_NAME, query = GET_APPRENTICE_BY_EMAIL_QUERY)
        }
)
public class ApprenticeEntity extends UserEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = TUTOR_COLUMN, updatable = false)
    private TutorEntity tutor;
    @Column(name = PROGRAM_COLUMN)
    private String program;
    @Column(name = MAJOR_COLUMN)
    private String major;
    @Column(name = YEAR_COLUMN)
    private String year;
    @Column(name = ARCHIVED_COLUMN)
    private boolean archived;

    public ApprenticeEntity() {
    }

    public ApprenticeEntity(TutorEntity tutor,
                            String email,
                            String firstName,
                            String lastName,
                            String phoneNumber,
                            String program,
                            String major,
                            String year,
                            boolean archived) {
        super(email, firstName, lastName, phoneNumber);
        this.tutor = tutor;
        this.program = program;
        this.major = major;
        this.year = year;
        this.archived = archived;
    }

    public ApprenticeEntity(String email,
                            String firstName,
                            String lastName,
                            String phoneNumber,
                            String program,
                            String major,
                            String year,
                            boolean archived) {
        this(null, email, firstName, lastName, phoneNumber, program, major, year, archived);
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
