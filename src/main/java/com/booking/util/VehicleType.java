/*
 * Developer: Indika Gunawardana
 * Date: 5/8/20, 6:42 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.util;

public enum VehicleType {
    MOTOR_CYCLE("MC"),
    THREE_WHEEL("TW"),
    CAR("CR"),
    VAN("VN"),
    SUV("SV"),
    BUS("BS"),
    CROSSOVER("CO"),
    LORRY("LR"),
    OTHER("OTH");

    VehicleType(String typeId) {
        this.typeId = typeId;
    }

    private String typeId;
}
