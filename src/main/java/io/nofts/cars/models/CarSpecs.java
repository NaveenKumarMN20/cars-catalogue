package io.nofts.cars.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class CarSpecs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer carId;
    private String carMake;
    private String carModel;
    private String makeYear;

}
