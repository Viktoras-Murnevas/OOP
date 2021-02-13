package com.company;

public enum Contract {
    FULL_TIME("Full Time"), PART_TIME("Part Time");

    private final String displayValue;

    Contract (String displayValue) { this.displayValue = displayValue; }

    @Override
    public String toString() {
        return displayValue;

    }
}
