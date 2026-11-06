package de.example.api.model;

import de.example.api.EntityTemplate;
import jakarta.persistence.Entity;

@Entity
public class Gps extends EntityTemplate {

    public Gps() {

    }

    private String longitude;
    private String latitude;
}
