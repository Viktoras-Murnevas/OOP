package com.company;

import java.util.Date;

public class LoansApplication {
    public static void main(String[] args) {

        //eina per constructorius ir pasiima
        Loan loan = new Loan();
        Loan jason = new Loan( 81818, 123456, LoanType.LEASING, new Date());
        Loan[] loans = {loan, jason}; // masyvas ir idejom papildaomai; 2x  masyve

        Customer john = new Customer("John", "Doe", 818, 818181818, loans);
//        Customer john = new Customer("John", "Doe", 818, 818181818, LoanType.LEASING);

        //Customer jason = new Customer("John", "Doe", 25);

        Customer customer = new Customer();
//        Customer.print();

        System.out.println(customer);
        System.out.println(john);


    }
}

