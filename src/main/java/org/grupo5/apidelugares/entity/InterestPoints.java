package org.grupo5.apidelugares.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.grupo5.apidelugares.dto.InterestPointsDto;

@Entity
@Table(name = "interest_points")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InterestPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeDoPoi;
    private Integer coordenadaX;
    private Integer coordenadaY;

    public InterestPoints(InterestPointsDto interestPointsDto){

        this.nomeDoPoi = interestPointsDto.getNomeDoPoi();
        this.coordenadaX = interestPointsDto.getCoordenadaX();
        this.coordenadaY = interestPointsDto.getCoordenadaY();

    }



}
