package com.company;

public enum Contract {
//ctrl+alt+l
    FULL_TIME("Full Time"), PART_TIME("Part Time");


    private final String displayValue;

    Contract (String displayValue) { this.displayValue = displayValue; }

// alt+insert > override
    @Override
    public String toString() {
        return displayValue;//"Test";//super.toString();

    }
}
