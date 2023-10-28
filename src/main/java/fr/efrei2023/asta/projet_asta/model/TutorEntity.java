package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import java.util.List;

import static fr.efrei2023.asta.projet_asta.utils.TutorConstants.*;

@Entity
@Table(name = TABLE_NAME, schema = DatabaseConstants.SCHEMA_NAME)
@NamedQueries({@NamedQuery(name = GET_TUTOR_BY_EMAIL_QUERY_NAME, query = GET_TUTOR_BY_EMAIL_QUERY)})
public class TutorEntity extends UserEntity {
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = ApprenticeConstants.TUTOR_COLUMN_NAME)
    List<ApprenticeEntity> apprentices;
    @Column(name = JOB_COLUMN_NAME)
    private String job;
    @Column(name = REMARK_COLUMN_NAME)
    private String remark;

    public List<ApprenticeEntity> getApprentices() {
        return apprentices;
    }
}
