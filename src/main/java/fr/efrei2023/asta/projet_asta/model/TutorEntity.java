package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants;
import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import java.util.List;

import static fr.efrei2023.asta.projet_asta.utils.TutorConstants.*;

@Entity
@Table(name = TABLE, schema = DatabaseConstants.SCHEMA)
@NamedQueries({@NamedQuery(name = GET_TUTOR_BY_EMAIL_QUERY_NAME, query = GET_TUTOR_BY_EMAIL_QUERY)})
public class TutorEntity extends UserEntity {
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = ApprenticeConstants.TUTOR_COLUMN)
    List<ApprenticeEntity> apprentices;
    @Column(name = JOB_COLUMN)
    private String job;
    @Column(name = REMARK_COLUMN)
    private String remark;

    public List<ApprenticeEntity> getApprentices() {
        return apprentices;
    }
}
