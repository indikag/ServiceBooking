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
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class BookingEntity {

    @Id
    @GenericGenerator(name = "id-generator", strategy = "com.booking.util.IdGenerator")
    @GeneratedValue(generator = "id-generator")
    @Column(name = "id", length = 100)
    private String bookingId;

    @Column(name = "vehicleId")
    private String vehicleId;

    @Column(name = "serviceLineId")
    private String serviceLineId;

    @Column(name = "timeSlotId")
    private String timeSlotId;

    @Column(name = "omReadingId")
    private String omReadingId;

    @Column(name = "bookingDate")
    private Date bookingDate;
}
