package org.launchcode.techjobs.oo;

public class Employer extends JobField {

    // Constructor that accepts a value and passes it to the JobField superclass
    public Employer(String value) {
        super(value); // Call the JobField constructor to initialize 'value'
    }

    // No need to redefine equals, hashCode, toString, getId, or getValue methods,
    // since these are inherited from JobField
}