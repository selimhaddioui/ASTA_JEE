package fr.efrei2023.asta.projet_asta.model.entity;


import fr.efrei2023.asta.projet_asta.utils.AstaConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Grade.*;


@Entity
@Table(name = TABLE, schema = AstaConstants.Database.SCHEMA)
public class GradeEntity {
    @Id
    @GeneratedValue
    @Column(name = ID_COLUMN)
    private String id;
    @ManyToOne
    @JoinColumn(name = APPRENTICE_COLUMN)
    private ApprenticeEntity apprentice;
    @Column(name = SUBJECT_COLUMN)
    private String subject;
    @Column(name = DATE_COLUMN)
    private String date;
    @Column(name = GRADE_COLUMN)
    private int grade;
    @Column(name = REMARKS_COLUMN)
    private String remarks;
    @Column(name = TYPE_COLUMN)
    private String type;

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getType() {
        return type;
    }
}
