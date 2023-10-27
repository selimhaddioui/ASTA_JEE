package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.TutorConstants.*;


@Entity
@Table(name = TUTOR_TABLE_NAME, schema = DatabaseConstants.USER_SCHEMA_NAME)
public class TutorEntity extends UserEntity {
    @Basic
    @Column(name = JOB_COLUMN_NAME)
    private String poste;
    @Basic @Column(name = REMARK_COLUMN_NAME)
    private String remarque;
}
