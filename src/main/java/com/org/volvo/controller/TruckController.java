package com.org.volvo.controller;

import com.org.volvo.model.Truck;
import com.org.volvo.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TruckController {
    @Autowired
    ServiceInterface ServiceInterface;

    //CRUD
    @PostMapping("/create")
    public void createTruck(@RequestBody Truck truck) {

        ServiceInterface.createTruck(truck);
    }

    @GetMapping("/getById/{truckId}")
    public Optional<Truck> getById(@PathVariable Integer truckId) {
        Optional<Truck> tt = ServiceInterface.getById(truckId);
        return tt;
    }

    @GetMapping("/getAll")
    public List<Truck> getAll() {
        List<Truck> t6 = ServiceInterface.getAll();
        return t6;
    }

    @PutMapping("/update")
    public void updateTruck(@RequestBody Truck truck) {

        ServiceInterface.updateTruck(truck);
    }

    @DeleteMapping("/delete/{truckId}")
    public String deleteById(@PathVariable Integer truckId) {
        String s = ServiceInterface.deleteById(truckId);
        return "success";
    }

    @PatchMapping("/updateNameById/{truckId}/{truckName}")
    public String updateNameById(@PathVariable Integer truckId, @PathVariable String truckName) {
        String t = ServiceInterface.updateNameById(truckId, truckName);
        return "success";
    }
}