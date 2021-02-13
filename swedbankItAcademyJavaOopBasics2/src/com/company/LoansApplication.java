package com.company;

import java.util.Date;

public class LoansApplication {
    public static void main(String[] args) {

        Loan loan = new Loan();
        Loan jason = new Loan( 81818, 123456, LoanType.LEASING, new Date());
        Loan[] loans = {loan, jason};

        Customer john = new Customer("John", "Doe", 818, 818181818, loans);

        Customer customer = new Customer();

        System.out.println(customer);
        System.out.println(john);
    }
}

