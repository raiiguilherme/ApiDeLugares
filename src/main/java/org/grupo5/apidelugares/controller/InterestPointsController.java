package org.grupo5.apidelugares.controller;

import org.grupo5.apidelugares.dto.GetInterestPointsAroundDto;
import org.grupo5.apidelugares.dto.InterestPointsDto;
import org.grupo5.apidelugares.entity.InterestPoints;
import org.grupo5.apidelugares.service.InterestPointsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interestpoint")
public class InterestPointsController {
    public InterestPointsController(InterestPointsService interestPointsService) {
        this.interestPointsService = interestPointsService;
    }
    private final InterestPointsService interestPointsService;


    @PostMapping("/create")
    public ResponseEntity<Void> createNewInterestPoint(@RequestBody InterestPointsDto interestPointsDto){

        interestPointsService.creatNewInterestPoint(interestPointsDto);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/get")
    public ResponseEntity<List<InterestPoints>> getAllPoints(){
        return ResponseEntity.ok(interestPointsService.getAllPoints());
    }

    @GetMapping("/getaround")
    public ResponseEntity<List<InterestPoints>> getAllPointsAround(@RequestBody GetInterestPointsAroundDto getInterestPointsAroundDto){
        return ResponseEntity.ok(interestPointsService.getInterestPointsAround(getInterestPointsAroundDto));
    }


}
