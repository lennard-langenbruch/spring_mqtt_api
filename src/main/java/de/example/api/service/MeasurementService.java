package de.example.api.service;

import de.example.api.model.Measurement;
import de.example.api.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementService {

    @Autowired
    MeasurementRepository repository;

    private void foo(Long id) {
        List<Measurement> result = repository.findAllById(List.of(id));
    }
}
