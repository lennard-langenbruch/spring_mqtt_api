package de.example.api.model;

import de.example.api.EntityTemplate;
import jakarta.persistence.Entity;

@Entity
public class Measurement extends EntityTemplate {

    public Measurement(){
        System.out.println(this);
    }

    private String temperature;
    private String humidity;
    private String estimatedBatteryCharge;
}
