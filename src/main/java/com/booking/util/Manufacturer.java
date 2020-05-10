/*
 * Developer: Indika Gunawardana
 * Date: 5/8/20, 6:42 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.util;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public enum Manufacturer {
    LAMBORGHINI("Lamborghini"),
    FERRARI("Ferrari"),
    ALFA_ROMEO("AlfaRomeo"),
    FIAT("Fiat"),
    PORSCHE("Porsche"),
    MERCEDES_BENZ("MercedesBenz"),
    AUDI("Audi"),
    VOLKSWAGEN("Volkswagen"),
    OPEL("Opel"),
    TOYOTA("Toyota"),
    NISSAN("Nissan"),
    INFINITI("Infiniti"),
    HONDA("Honda"),
    LEXUS("Lexus"),
    SUZUKI("Suzuki"),
    DATSUN("Datsun"),
    SUBARU("Subaru"),
    ISUZU("Isuzu"),
    MITSUBISHI("Mitsubishi"),
    MAZDA("Mazda"),
    DAIHATSU("Daihatsu"),
    MINI("Mini"),
    JAGUAR("Jaguar"),
    ARIEL("Ariel"),
    LAND_ROVER("LandRover"),
    MG_MOTORS("MG"),
    MAHINDRA("Mahindra"),
    TATA("Tata"),
    FORCE("Force"),
    MARUTI_SUZUKI("MarutiSuzuki"),
    HINDUSTAN_MOTORS("HindustanMotors"),
    DC("DC"),
    EICHE("Eiche"),
    RENAULT("Renault"),
    BUGATTI("Bugatti"),
    PEUGEOT("Peugeot"),
    CITROEN("Citroen"),
    HYUNDAI("Hyundai"),
    SSANGYONG("SsangYong"),
    DAEWOO("Daewoo"),
    KIA("Kia"),
    PROTON("Proton"),
    OTHER("Other");

    private String manufacturerName;

}