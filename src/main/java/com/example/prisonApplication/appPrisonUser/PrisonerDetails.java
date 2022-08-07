package com.example.prisonApplication.appPrisonUser;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class PrisonerDetails {

    @Id
    @SequenceGenerator(name = "prisoner_sequence", sequenceName = "prisoner_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prisoner_sequence")
    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nationality;
    private Date firstDayOfPunishment;
    private String lastDateOfPunishment;
    private String description;

    public PrisonerDetails() {}



    public Long getId() {
        return id;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getFirstDayOfPunishment() {
        return firstDayOfPunishment;
    }

    public void setFirstDayOfPunishment(Date firstDayOfPunishment) {
        this.firstDayOfPunishment = firstDayOfPunishment;
    }

    public String getLastDateOfPunishment() {
        return lastDateOfPunishment;
    }

    public void setLastDateOfPunishment(String lastDateOfPunishment) {
        this.lastDateOfPunishment = lastDateOfPunishment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}