package de.example.api;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class EntityTemplate {

    @GeneratedValue
    @Id
    protected Long id;
    protected String createdBy;
    protected LocalDateTime createdAt;
}