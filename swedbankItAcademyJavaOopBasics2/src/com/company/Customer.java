package com.company;

import java.util.Arrays;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private long personalNumber;
    private Loan[] loans;

    public Customer() {}

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Customer(String name, String surname, int age, long personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber=" + personalNumber +
                ", loans=" + Arrays.toString(loans) +
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
