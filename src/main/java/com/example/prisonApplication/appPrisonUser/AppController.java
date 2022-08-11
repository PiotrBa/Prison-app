package com.example.prisonApplication.appPrisonUser;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/prision/prisioner")
@AllArgsConstructor
public class AppController{

    private final AppImplementation appImplementation;


    @GetMapping
    public List<PrisonerDetails> getPrisoner(){
        return appImplementation.findAllPrisoners();
    }

    @GetMapping("/{prisonerId}")
    public PrisonerDetails getOnePrisoner(@PathVariable Long prisonerId){
        return appImplementation.findOnePrisoner(prisonerId);
    }

    @PostMapping("/add")
    public PrisonerDetails addPrisoner(@RequestBody Map<String, Object> map){
        return appImplementation.addPrisoner(map);
    }

    @PutMapping("/{prisonerId}")
    public PrisonerDetails editPrisonerDetails (@PathVariable Long prisonerId, @RequestBody Map<String, Object>map){
        return appImplementation.editPrisoner(prisonerId, map);
    }

    @DeleteMapping("/{prisonerId}")
    public PrisonerDetails deletePrisoner (@PathVariable Long prisonerId){
        return appImplementation.deletePrisoner(prisonerId);
    }

}
