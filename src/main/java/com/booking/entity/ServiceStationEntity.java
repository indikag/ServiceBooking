/*
 * Developer: Indika Gunawardana
 * Date: 5/8/20, 6:42 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ServiceStation")
public class ServiceStationEntity {

    @Id
    @GenericGenerator(name = "id-generator", strategy = "com.booking.util.IdGenerator")
    @GeneratedValue(generator = "id-generator")
    @Column(name = "id", length = 100)
    private String stationId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "contactNo")
    private String contactNo;

    @Column(name = "longitude")
    private float longitude;

    @Column(name = "latitude")
    private float latitude;
}
