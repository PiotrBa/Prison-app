package com.example.prisonApplication.appPrisonUser;

import java.util.List;
import java.util.Map;

public interface AppImplementation {


    List<PrisonerDetails> findAllPrisoners ();
    PrisonerDetails findOnePrisoner (Long prisonerId);
    PrisonerDetails addPrisoner (Map<String, Object> map);
    PrisonerDetails editPrisoner (Long prisonerId, Map<String, Object> map);
    PrisonerDetails deletePrisoner (Long prisonerId);
}
