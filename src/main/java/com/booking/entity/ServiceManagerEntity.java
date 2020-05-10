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
@Table(name = "ServiceManager")
public class ServiceManagerEntity {
    @Id
    @GenericGenerator(name = "id-generator", strategy = "com.booking.util.IdGenerator")
    @GeneratedValue(generator = "id-generator")
    @Column(name = "id", length = 100)
    private String serviceManagerId;

    @Column(name = "smName")
    private String serviceManagerName;

    @Column(name = "smContactNo")
    private String serviceManagerContactNo;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;
}
