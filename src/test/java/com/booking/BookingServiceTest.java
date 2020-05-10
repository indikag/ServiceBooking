/*
 * Developer: Indika Gunawardana
 * Date: 5/8/20, 6:41 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking;

import com.booking.entity.BookingEntity;
import com.booking.repos.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingServiceTest {
    @Autowired
    BookingRepository bookingRepository;

    @Test
    void getAllBookings() {
        BookingEntity entity = new BookingEntity();
        entity.setVehicleId("1");
        entity.setBookingDate(new Date());
        entity.setOmReadingId("1");
        entity.setServiceLineId("1");
        entity.setTimeSlotId("1");

        bookingRepository.save(entity);
        List<BookingEntity> all = bookingRepository.findAll();
        assertEquals(1, all.size(), "We got the saved one");

    }
}