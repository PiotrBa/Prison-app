package com.example.prisonApplication.appPrisonUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private Boolean isPublished;


    public void setPublished(Boolean published) {
        isPublished = published;
    }
}
