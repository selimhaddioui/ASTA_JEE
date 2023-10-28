package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.UserConstants.*;

@Entity
@Table(name = TABLE_NAME, schema = DatabaseConstants.SCHEMA_NAME)
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({@NamedQuery(name = GET_USER_BY_EMAIL_QUERY_NAME, query = GET_USER_BY_EMAIL_QUERY)})
public class UserEntity {
    @Id
    @Column(name = EMAIL_COLUMN_NAME, nullable = false, unique = true)
    private String email;
    @GeneratedValue
    @Column(name = PASSWORD_COLUMN_NAME, nullable = false)
    private String password;
    @Column(name = FIRSTNAME_COLUMN_NAME)
    private String firstName;
    @Column(name = LASTNAME_COLUMN_NAME)
    private String lastName;
    @Column(name = PHONE_NUMBER_COLUMN_NAME)
    private String phoneNumber;

    public UserEntity() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isPasswordCorrect(String password) {
        return this.password.equals(password);
    }
}
