/*
 * Developer: Indika Gunawardana
 * Date: 5/9/20, 4:31 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/user/register").permitAll()
        .anyRequest().authenticated();

    }
}
