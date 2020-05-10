/*
 * Developer: Indika Gunawardana
 * Date: 5/8/20, 6:42 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.entity;

import com.booking.util.Manufacturer;
import com.booking.util.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Vehicle")
public class VehicleEntity {
    @Id
    @GenericGenerator(name = "id-generator", strategy = "com.booking.util.IdGenerator")
    @GeneratedValue(generator = "id-generator")
    @Column(name = "id", length = 100)
    private String vehicleId;

    @Column(name = "type")
    private VehicleType type;

    @Column(name = "manufacturer")
    private Manufacturer manufacturer;

    @Column(name = "model")
    private String model;

    @Column(name = "yom")
    private String yearOfManufacture;

    @Column(name = "yor")
    private String yearOfRegister;
}
