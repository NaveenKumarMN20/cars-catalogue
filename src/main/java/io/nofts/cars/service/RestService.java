package io.nofts.cars.service;

import io.nofts.cars.models.CarSpecs;
import io.nofts.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestService {

    @Autowired
    private CarRepository carRepository;

    public List<CarSpecs> getAllCars() {
        return carRepository.findAll();
    }

    public CarSpecs getCarById(Integer carId) {
        return carRepository.findById(carId).orElse(null);
    }

    public List<CarSpecs> getCarsBySpecs(CarSpecs carSpecs) {
        return carRepository.findAll(Example.of(carSpecs));
    }

    public List<CarSpecs> getCarsByMake(String carMake) {
        return carRepository.findByCarMake(carMake);
    }

    public CarSpecs addCarSpecs(CarSpecs carSpecs) {
        return carRepository.save(carSpecs);
    }

}
