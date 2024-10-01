package org.launchcode.techjobs.oo;

// CoreCompetency now extends JobField
public class CoreCompetency extends JobField {

    // Constructor that accepts a value and passes it to the superclass
    public CoreCompetency(String value) {
        super(value);  // Call to the JobField constructor to initialize the 'value' field
    }

    // No need to redefine equals, hashCode, toString, getId, or getValue methods,
    // since these are inherited from JobField
}
