package com.example.prisonApplication.appPrisonUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisonerRepository extends JpaRepository<PrisonerDetails, Long> {

}
