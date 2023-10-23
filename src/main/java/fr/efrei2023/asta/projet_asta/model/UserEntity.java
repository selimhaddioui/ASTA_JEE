package fr.efrei2023.asta.projet_asta.model;

import fr.efrei2023.asta.projet_asta.utils.DatabaseConstants;
import jakarta.persistence.*;

import static fr.efrei2023.asta.projet_asta.utils.UserConstants.*;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(
        name = USER_TABLE_NAME,
        schema = DatabaseConstants.USER_SCHEMA_NAME,
        uniqueConstraints = @UniqueConstraint(columnNames = EMAIL_COLUMN_NAME)
)
@NamedQueries({@NamedQuery(name = GET_USER_BY_EMAIL_QUERY_NAME, query = GET_USER_BY_EMAIL_QUERY)})
public class UserEntity {
    @Id @Basic @Column(name = EMAIL_COLUMN_NAME, nullable = false)
    private String email;
    @Basic @Column(name = PASSWORD_COLUMN_NAME, nullable = false)
    private String password;
    @Basic @Column(name = FIRSTNAME_COLUMN_NAME)
    private String firstName;
    @Basic @Column(name = LASTNAME_COLUMN_NAME)
    private String lastName;
    @Basic @Column(name = PHONE_NUMBER_COLUMN_NAME)
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isPasswordCorrect(String password) {
        return this.password.equals(password);
    }
}
