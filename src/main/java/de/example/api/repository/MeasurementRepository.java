package de.example.api.repository;

import de.example.api.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

    @Override
    List<Measurement> findAllById(Iterable<Long> longs);


    Measurement save(Measurement m);
}
