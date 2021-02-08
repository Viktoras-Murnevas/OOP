package com.company;

import java.util.Date;

import static com.company.Contract.FULL_TIME;

public class EmployeeManager {
    public static void main(String[] args) {

//eina per constructorius ir pasiima
       Employee john = new Employee("John", "Doe", new Date(), 818, "beginner", FULL_TIME);

//        Employee jason = new Employee("John", "Doe", 25);

        Employee employee = new Employee();
        employee.print();

        System.out.println(employee);
        System.out.println(john);

    }
}
