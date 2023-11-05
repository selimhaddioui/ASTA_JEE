package fr.efrei2023.asta.projet_asta.model.entity;

import java.util.Date;

import jakarta.persistence.*;

import fr.efrei2023.asta.projet_asta.model.entity.embeddable.VisitId;
import fr.efrei2023.asta.projet_asta.utils.AstaConstants;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Visit.*;

@Entity
@Table(name = TABLE, schema = AstaConstants.Database.SCHEMA)
public class VisitEntity {
    @EmbeddedId
    private VisitId id;
    @Column(name = FORMAT_COLUMN)
    private String format;
    @Column(name = REMARK_COLUMN)
    private String remarks;

    public String getDate() {
        return id.getDate();
    }

    public String getFormat() {
        return format;
    }

    public String getRemarks() {
        return remarks;
    }
}