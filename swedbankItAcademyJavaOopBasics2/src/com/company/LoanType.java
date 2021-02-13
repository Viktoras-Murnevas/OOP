package com.company;

public enum LoanType {

    LEASING("Leasing"), CONSUMER("Consumer");

    private final String displayValue;

    LoanType (String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

}

