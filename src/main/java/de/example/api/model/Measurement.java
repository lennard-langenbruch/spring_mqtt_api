package de.example.api.model;

import de.example.api.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import java.awt.Point;

@Entity
public class Measurement extends BaseEntity {

        public Measurement(@NonNull Float temperature, @NonNull Float humidity, @NonNull String battery, @NonNull Point location) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.estimatedBatteryCharge = battery;
        this.location = location;

    }

    private Float temperature;
    private Float humidity;
    private String estimatedBatteryCharge;
    private Point location;
}
