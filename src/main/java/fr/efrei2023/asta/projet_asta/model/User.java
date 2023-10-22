package fr.efrei2023.asta.projet_asta.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @Column(name = "ID_User", nullable = false)
    private String login;
    @Column(name = "MotDePasse", nullable = false)
    private String password;
    @Column(name = "Prenom", nullable = false)
    private String firstName;
    @Column(name = "Nom", nullable = false)
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Tel")
    private String phoneNumber;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
