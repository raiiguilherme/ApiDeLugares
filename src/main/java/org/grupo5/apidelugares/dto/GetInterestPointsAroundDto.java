package org.grupo5.apidelugares.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetInterestPointsAroundDto {
    private Integer coordenadaX;
    private Integer coordenadaY;
    private Integer distanciaM;

}
