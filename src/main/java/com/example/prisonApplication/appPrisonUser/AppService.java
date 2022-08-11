package com.example.prisonApplication.appPrisonUser;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AppService implements AppImplementation{

    private PrisonerRepository prisonerRepository;


    @Override
    public List<PrisonerDetails> findAllPrisoners() {
        return prisonerRepository.findAllByIsPublished(true);
    }

    @Override
    public PrisonerDetails findOnePrisoner(Long prisonerId) {
        Optional<PrisonerDetails> optional = prisonerRepository.findById(prisonerId);
        PrisonerDetails prisonerDetails = optional.orElseThrow(()-> new RuntimeException("The prisoner id: " + prisonerId +  " does not exist"));
        return prisonerDetails;
    }

    @Override
    public PrisonerDetails addPrisoner(Map<String, Object> map) {
        PrisonerDetails prisonerDetails = new PrisonerDetails();;
        prisonerDetails.setFirstName(map.get("firstName").toString());
        prisonerDetails.setLastName(map.get("lastName").toString());
        prisonerDetails.setDateOfBirth(map.get("dateOfBirth").toString());
        prisonerDetails.setNationality(map.get("nationality").toString());
        prisonerDetails.setFirstDayOfPunishment(Date.valueOf(LocalDate.now()));
        prisonerDetails.setLastDateOfPunishment(map.get("lastDateOfPunishment").toString());
        prisonerDetails.setDescription(map.get("description").toString());
        prisonerDetails.setPublished(true);
        return prisonerRepository.save(prisonerDetails);
    }

    @Override
    public PrisonerDetails editPrisoner(Long prisonerId, Map<String, Object> map) {
        Optional<PrisonerDetails> optional = prisonerRepository.findById(prisonerId);
        PrisonerDetails prisonerDetails = optional.orElseThrow(()-> new RuntimeException("The prisoner id: " + prisonerId +  " does not exist"));
        prisonerDetails.setDescription(map.get("description").toString());
        System.out.println("Edition profil of prisoner number: " + prisonerId + ".");
        return prisonerRepository.save(prisonerDetails);
    }
    @Override
    public PrisonerDetails deletePrisoner(Long prisonerId) {
        Optional<PrisonerDetails> optional = prisonerRepository.findById(prisonerId);
        PrisonerDetails prisonerDetails = optional.orElseThrow(()-> new RuntimeException("The prisoner id: " + prisonerId +  " does not exist"));
        prisonerRepository.delete(prisonerDetails);
        System.out.println("Delete profil of prisoner number: " + prisonerId + ".");
        return prisonerRepository.save(prisonerDetails);
    }
}
