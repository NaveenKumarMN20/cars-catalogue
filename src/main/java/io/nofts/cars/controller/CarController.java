package io.nofts.cars.controller;

import io.nofts.cars.models.CarSpecs;
import io.nofts.cars.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private RestService restService;

    @GetMapping("/getAllCars")
    public ResponseEntity<List<CarSpecs>> getAllCars() {
        return ResponseEntity.ok(restService.getAllCars());
    }

    @GetMapping("/getByCarId/{carId}")
    public ResponseEntity<CarSpecs> getByCarId(@PathVariable Integer carId) {
        return ResponseEntity.ok(restService.getCarById(carId));
    }

    @GetMapping("/getCarByMake/{carMake}")
    public ResponseEntity<List<CarSpecs>> getCarsByMake(@PathVariable String carMake) {
        return ResponseEntity.ok(restService.getCarsByMake(carMake));
    }

    @GetMapping("/getCarBySpecs")
    public ResponseEntity<List<CarSpecs>> getCarsBySpecs(@RequestBody CarSpecs carSpecs) {
        return ResponseEntity.ok(restService.getCarsBySpecs(carSpecs));
    }

    @PostMapping("/addCarSpecs")
    public ResponseEntity<CarSpecs> addCarSpecs(@RequestBody CarSpecs carSpecs) {
        return ResponseEntity.ok(restService.addCarSpecs(carSpecs));
    }

}
