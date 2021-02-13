package com.company;

import java.util.Date;

public class Loan {

    private long id;
    private int amount;
    private LoanType loanType;
    private Date terminationDate;

    public Loan() {}

    public Loan(long id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public Loan(long id, int amount, LoanType loanType, Date terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate=" + terminationDate +
                '}';
    }


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
