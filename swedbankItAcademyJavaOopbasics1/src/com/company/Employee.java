package com.company;

import java.util.Date;

public class Employee {

        private String name;
        private String surname;
        private Date contractStartDate;
        private int salary;
        private String position;
        private Contract contract;

    public Employee() {}

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, Date contractStartDate, int salary, String position, Contract contract) {
        this.name = name;
        this.surname = surname;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
        this.contract = contract;
    }

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
