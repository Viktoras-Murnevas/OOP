package com.company;

import java.util.Date;

public class Employee {

// encapsulation  =  private + constructorius
        private String name;
        private String surname;
        private Date contractStartDate;
        private int salary;
        private String position;
        private Contract contract;

//1-as constructorius
    public Employee() {}

//2-as constructorius
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

//3-ias constructorius
//alt+insert helps to create constructor
    public Employee(String name, String surname, Date contractStartDate, int salary, String position, Contract contract) {
        this.name = name;
        this.surname = surname;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
        this.contract = contract;
    }

//alt+insert to String
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractStartDate=" + contractStartDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", contract='" + contract + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void print() {
    }
}
