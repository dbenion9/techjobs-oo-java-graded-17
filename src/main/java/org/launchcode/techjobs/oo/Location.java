package org.launchcode.techjobs.oo;

// Import Objects utility for equals and hashCode
import java.util.Objects;

// Location now extends JobField
public class Location extends JobField {

    // Constructor that accepts a value and passes it to the superclass
    public Location(String value) {
        super(value);  // Call to the JobField constructor to initialize the 'value' field
    }

    // No need to redefine equals, hashCode, toString, getId, or getValue methods,
    // since these are inherited from JobField
}