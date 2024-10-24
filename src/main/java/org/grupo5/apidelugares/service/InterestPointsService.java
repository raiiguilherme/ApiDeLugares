package org.grupo5.apidelugares.service;

import org.grupo5.apidelugares.dto.GetInterestPointsAroundDto;
import org.grupo5.apidelugares.dto.InterestPointsDto;
import org.grupo5.apidelugares.entity.InterestPoints;
import org.grupo5.apidelugares.repository.InterestPointsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterestPointsService {
    public InterestPointsService(InterestPointsRepository interestPointsRepository) {
        this.interestPointsRepository = interestPointsRepository;
    }
    private final InterestPointsRepository interestPointsRepository;




    public void creatNewInterestPoint(InterestPointsDto interestPointsDto ){

        InterestPoints interestPoints = new InterestPoints(interestPointsDto);
        interestPointsRepository.save(interestPoints);

    }
    public List<InterestPoints> getAllPoints(){
        return interestPointsRepository.findAll();
    }

    public List<InterestPoints> getInterestPointsAround(GetInterestPointsAroundDto getInterestPointsAroundDto){
        List<InterestPoints> list = getAllPoints();
        List<InterestPoints> listAround = new ArrayList<>();

        for(InterestPoints p: list){
                var diferencaX = p.getCoordenadaX()- getInterestPointsAroundDto.getCoordenadaX();
                var diferencaY = p.getCoordenadaY()- getInterestPointsAroundDto.getCoordenadaY();

                if (Math.abs(diferencaX)+Math.abs(diferencaY)<=getInterestPointsAroundDto.getDistanciaM()){
                    listAround.add(p);
               }
        }
        return listAround;
    }

}
