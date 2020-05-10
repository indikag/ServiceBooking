/*
 * Developer: Indika Gunawardana
 * Date: 5/9/20, 2:01 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";


    @Override
    public String getErrorPath() {
        return PATH;
    }
}
