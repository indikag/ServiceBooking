/*
 * Developer: Indika Gunawardana
 * Date: 5/9/20, 2:01 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.controller;

import com.booking.entity.VehicleOwnerEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    //As a vehicle owner, I want to register with the systems so that I can use the system
    @PostMapping("/user/register")
    String registerNewUser(@RequestBody VehicleOwnerEntity ownerEntity) {
        System.out.println("Register new user");
        return "Success";
    }

    //As a vehicle owner, I want to login to the system so I can make a booking.
    @GetMapping("/user/login")
    void login() {

    }

    //As a vehicle owner, I want to add my vehicles to the system
    @PutMapping("/vehicle/add")
    void addVehicle() {

    }

    //As a vehicle owner, I want to search service stations by name
    @GetMapping("/station/find/{stationName}")
    void searchStations(@PathVariable String stationName) {

    }

    //As a vehicle owner, I want to search service stations by less appointment numbers
    @GetMapping("/station/find")
    void searchStationsWithLessAppointments() {

    }

    //As a vehicle owner, I want to available slots of a selected service station
    @GetMapping("/station/{stationId}")
    void getAvailableSlotsByStationId(@PathVariable String stationId) {

    }

    //As a vehicle owner, I want to book a service station by date and time
    @PutMapping("/station/booking")
    void bookService() {

    }
    //As a vehicle owner, I want to see the status of my vehicle
    @GetMapping("/booking/status/{bookingId}")
    void getVehicleStatus(@PathVariable String bookingId) {

    }

    //As a vehicle owner, I want to request to cancel a booking 1 day before the service schedule date
    @PutMapping("/booking/{bookingId}")
    void cancelBook(@PathVariable String bookingId) {

    }

    //As a vehicle owner, I want to select different service stations for different vehicles
    // this can be done via one of above service.
}
