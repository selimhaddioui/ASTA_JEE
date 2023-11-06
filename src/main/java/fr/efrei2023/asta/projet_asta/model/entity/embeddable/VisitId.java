package fr.efrei2023.asta.projet_asta.model.entity.embeddable;

import java.io.Serializable;
import java.util.Objects;

import fr.efrei2023.asta.projet_asta.model.entity.ApprenticeEntity;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Visit.*;

@Embeddable
public class VisitId implements Serializable {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = APPRENTICE_COLUMN)
    private ApprenticeEntity apprentice;
    @Column(name = DATE_COLUMN)
    private String date;

    public VisitId() {

    }

    public ApprenticeEntity getApprentice() {
        return apprentice;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VisitId visitId)) return false;
        return apprentice.equals(visitId.apprentice) && date.equals(visitId.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apprentice, date);
    }
}
