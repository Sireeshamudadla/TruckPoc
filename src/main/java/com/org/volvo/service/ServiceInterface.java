package com.org.volvo.service;

import com.org.volvo.model.Truck;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface {
    public void createTruck(Truck truck);
    public Optional<Truck> getById(Integer truckId );
    public List<Truck> getAll();
    public void updateTruck(Truck truck);
    public String deleteById( Integer id);
    public String updateNameById( Integer truckId, String truckName);
}
