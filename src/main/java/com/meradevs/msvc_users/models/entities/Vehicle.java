package com.meradevs.msvc_users.models.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private String color;

    private Integer year;

    @Column(name = "is_active")
    private Boolean active;

    @ManyToOne
    private VehicleCategory category;

    @Column(name = "license_plate")
    private String licensePlate;

    @Lob
    private byte[] license;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @ManyToOne
    private User user;

    @PrePersist
    private void prePersist() {
        this.creationDate = LocalDateTime.now();
        if (this.active == null) {
            this.active = true;
        }
    }
}
