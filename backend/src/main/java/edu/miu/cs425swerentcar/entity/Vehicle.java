package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "color")
    private String color;

    private int numberOfSeats;

    private String fuelType;

    private double price;

    private String transmission;

//    private String availability;
    private VehicleStatus vehicleStatus;
    private String plateNumber;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;
}
