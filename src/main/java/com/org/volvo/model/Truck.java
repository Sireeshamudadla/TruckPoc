package com.org.volvo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Truck {
    @Id
    private int truckId;
    private String truckName;
    private String truckColour;
    private double truckWeight;

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public String getTruckColour() {
        return truckColour;
    }

    public void setTruckColour(String truckColour) {
        this.truckColour = truckColour;
    }

    public double getTruckWeight() {
        return truckWeight;
    }

    public void setTruckWeight(double truckWeight) {
        this.truckWeight = truckWeight;
    }
}
