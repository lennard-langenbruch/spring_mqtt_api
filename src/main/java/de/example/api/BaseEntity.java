package de.example.api;

import jakarta.persistence.*;
import org.hibernate.annotations.Audited;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MappedSuperclass
@Audited
public abstract class BaseEntity implements Serializable {

    // Inherit Logger Stream
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        log.info("Persisting entity: {}", this);
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
        log.info("Updating entity: {}", this);
    }
}