package fr.efrei2023.asta.projet_asta.model;

import jakarta.persistence.*;

@Entity(name = "Apprenti")
public class Apprentice extends User {
    @Column(name = "Programme", nullable = false)
    private String program;
    @Column(name = "Majeure", nullable = false)
    private String major;
    @Column(name = "Archiver", nullable = false)
    private boolean archived;
}
