package com.company;

public enum LoanType {
//ctrl+alt+l
    LEASING("Leasing"), CONSUMER("Consumer");

    private final String displayValue;

    LoanType (String displayValue) { this.displayValue = displayValue; }

// alt+insert > override

    @Override
    public String toString() {
        return displayValue;
    }
//        return "LoanType{" +
//                "displayValue='" + displayValue + '\'' +
//                '}';
//    }
}

