/*
 * Developer: Indika Gunawardana
 * Date: 5/8/20, 6:42 PM
 * Copyright(c)  2020 MockStack
 */

package com.booking.repos;

import com.booking.entity.TimeSlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSlotRepository extends JpaRepository<TimeSlotEntity, String> {
}
