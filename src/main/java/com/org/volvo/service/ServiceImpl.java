package com.org.volvo.service;

import com.org.volvo.model.Truck;
import com.org.volvo.repository.TruckRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ServiceInterface {
    @Autowired
    TruckRepo truckRepo;
    @Override
    public void createTruck(Truck truck) {
        truckRepo.save(truck);
    }
    @Override
    public Optional<Truck> getById(Integer truckId) {
        Optional<Truck> truck = truckRepo.findById(truckId);
        return truck;
    }
    @Override
    public List<Truck> getAll() {
        List<Truck> tru=   truckRepo.findAll();
        return tru;
    }

    @Override
    public void updateTruck(Truck truck) {
        truckRepo.save(truck);
    }

    @Override
    public String deleteById(Integer truckId) {
        truckRepo.deleteById(truckId);
        return null;
    }

    @Override
    public String updateNameById(Integer truckId, String truckName) {
        Optional<Truck> truck= truckRepo.findById(truckId);
        Truck truck1= truck.get();
        truck1.setTruckName(truckName);
        truckRepo.save(truck1);
        return "success";
    }
}
