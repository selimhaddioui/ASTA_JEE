package fr.efrei2023.asta.projet_asta.model.entity;

import jakarta.persistence.*;

import fr.efrei2023.asta.projet_asta.utils.AstaConstants;

import java.util.Objects;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Job.*;

@Entity
@Table(name = TABLE, schema = AstaConstants.Database.SCHEMA)
public class JobEntity {
    @Id
    @OneToOne
    @JoinColumn(name = APPRENTICE_COLUMN)
    private ApprenticeEntity worker;
    @ManyToOne
    @JoinColumn(name = COMPANY_COLUMN)
    private CompanyEntity company;

    @Column(name = DESCRIPTION_COLUMN)
    private String descriptionKeysWords;

    @Column(name = CIGREF_JOB_COLUMN)
    private String cigrefJob;

    @Column(name = REMARK_COLUMN)
    private String remarks;

    public CompanyEntity getCompany() {
        return company;
    }

    public String getDescriptionKeysWords() {
        return descriptionKeysWords;
    }

    public String getCigrefJob() {
        return cigrefJob;
    }

    public String getRemarks() {
        return remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobEntity jobEntity = (JobEntity) o;
        return Objects.equals(worker, jobEntity.worker) && Objects.equals(company, jobEntity.company) && Objects.equals(descriptionKeysWords, jobEntity.descriptionKeysWords) && Objects.equals(cigrefJob, jobEntity.cigrefJob) && Objects.equals(remarks, jobEntity.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, company, descriptionKeysWords, cigrefJob, remarks);
    }
}
