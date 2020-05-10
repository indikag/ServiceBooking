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
@Table(name = "BranchManager")
public class BranchManagerEntity {

    @Id
    @GenericGenerator(name = "id-generator", strategy = "com.booking.util.IdGenerator")
    @GeneratedValue(generator = "id-generator")
    @Column(name = "id", length = 100)
    private String branchManagerId;

    @Column(name = "name")
    private String branchManagerName;

    @Column(name = "contactNo")
    private String branchManagerContactNo;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;
}