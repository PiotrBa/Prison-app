package com.example.prisonApplication.appPrisonUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrisonerRepository extends JpaRepository<PrisonerDetails, Long> {

    List<PrisonerDetails> findAllByIsPublished (Boolean isPublished);

}
