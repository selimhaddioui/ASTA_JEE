package fr.efrei2023.asta.projet_asta.model.entity;

import jakarta.persistence.*;

import fr.efrei2023.asta.projet_asta.utils.AstaConstants;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Company.*;

@Entity
@Table(name = TABLE, schema = AstaConstants.Database.SCHEMA)
public class CompanyEntity {
    @Id
    @Column(name = COMPANY_NAME_COLUMN, nullable = false, unique = true, updatable = false)
    private String companyName;
    @Column(name = ADDRESS_COLUMN)
    private String address;

    @Column(name = ACCESS_INFO_COLUMN)
    private String accessInformation;

    public String getAccessInformation() {
        return accessInformation;
    }

    public String getAddress() {
        return address;
    }

    public CompanyEntity() {
    }

    public String getCompanyName() {
        return companyName;
    }
}
