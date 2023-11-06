package fr.efrei2023.asta.projet_asta.model.entity;

import java.util.List;

import jakarta.persistence.*;

import fr.efrei2023.asta.projet_asta.utils.AstaConstants;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Tutor.*;

@Entity
@Table(name = TABLE, schema = AstaConstants.Database.SCHEMA)
@NamedQueries({@NamedQuery(name = GET_TUTOR_BY_EMAIL_QUERY_NAME, query = GET_TUTOR_BY_EMAIL_QUERY)})
public class TutorEntity extends UserEntity {
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = AstaConstants.Apprentice.TUTOR_COLUMN)
    List<ApprenticeEntity> apprentices;
    @Column(name = JOB_COLUMN)
    private String job;
    @Column(name = REMARK_COLUMN)
    private String remark;

    public String getJob() {
        return job;
    }

    public List<ApprenticeEntity> getApprentices() {
        return apprentices;
    }
}
