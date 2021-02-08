package com.company;

import java.util.Date;

public class Loan {

    private long id;
    private int amount;
    private LoanType loanType;
    private Date terminationDate;

//1-as constructorius
    public Loan() {}

//2-as constructorius
    public Loan(long id, int amount) {
        this.id = id;
        this.amount = amount;
    }

//3-ias constructorius
//alt+insert helps to create constructor

    public Loan(long id, int amount, LoanType loanType, Date terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

//alt+insert to String
    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate=" + terminationDate +
                '}';
    }

// get getters with alt+insert
    public long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public LoanType getLoanType() {
        return loanType;
    }

}
