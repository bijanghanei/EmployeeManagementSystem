package com.bijanghanei.EmployeeManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "id")
    Integer Id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;

}
