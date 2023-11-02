package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.UserConstants.*;

@Entity
@Table(name = TABLE, schema = DatabaseConstants.SCHEMA)
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(
        {
                @NamedQuery(name = GET_USER_BY_EMAIL_QUERY_NAME, query = GET_USER_BY_EMAIL_QUERY)
        }
)
public class UserEntity {
    @Id
    @Column(name = EMAIL_COLUMN, nullable = false, unique = true, updatable = false)
    private String email;
    @GeneratedValue
    @Column(name = PASSWORD_COLUMN, nullable = false)
    private String password;
    @Column(name = FIRSTNAME_COLUMN)
    private String firstName;
    @Column(name = LASTNAME_COLUMN)
    private String lastName;
    @Column(name = PHONE_NUMBER_COLUMN)
    private String phoneNumber;

    public UserEntity() {

    }

    public UserEntity(String email, String firstName, String lastName, String phoneNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isPasswordCorrect(String password) {
        return this.password.equals(password);
    }
}
