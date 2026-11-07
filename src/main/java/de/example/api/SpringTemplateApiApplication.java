package de.example.api;

import de.example.api.model.Measurement;
import de.example.api.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.awt.*;


@SpringBootApplication
    public class SpringTemplateApiApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringTemplateApiApplication.class, args);
    }

    @Autowired
    MeasurementRepository mRepository;

    Measurement m = new Measurement(3.0f,4.0f,"3.0", new Point(1, 2));
    Measurement savedMeasurement = mRepository.save(m);
}
