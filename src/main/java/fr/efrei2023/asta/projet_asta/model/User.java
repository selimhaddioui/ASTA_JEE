package fr.efrei2023.asta.projet_asta.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "MotDePasse", nullable = false)
    private String password;
    @Column(name = "Prenom", nullable = false)
    private String firstName;
    @Column(name = "Nom", nullable = false)
    private String lastName;
    @Column(name = "Tel")
    private String phoneNumber;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
