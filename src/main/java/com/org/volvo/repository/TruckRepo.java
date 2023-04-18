package com.org.volvo.repository;

import com.org.volvo.model.Truck;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepo extends JpaRepository<Truck,Integer> {


}
