package org.launchcode.techjobs.oo;

import java.util.Objects;


public class Job {
    // Field declarations
    private int id;
    private static int nextId = 1;  // Static counter for unique ID assignment
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // Constructor that initializes the ID with a unique value
    public Job() {
        this.id = nextId++;
    }

    // Constructor that initializes all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Custom toString() method that formats Job data
    @Override
    public String toString() {
        String result = System.lineSeparator();

        result += "ID: " + id + System.lineSeparator();
        result += "Name: " + (name != null && !name.isEmpty() ? name : "Data not available") + System.lineSeparator();
        result += "Employer: " + (employer != null && employer.getValue() != null && !employer.getValue().isEmpty() ? employer.getValue() : "Data not available") + System.lineSeparator();
        result += "Location: " + (location != null && location.getValue() != null && !location.getValue().isEmpty() ? location.getValue() : "Data not available") + System.lineSeparator();
        result += "Position Type: " + (positionType != null && positionType.getValue() != null && !positionType.getValue().isEmpty() ? positionType.getValue() : "Data not available") + System.lineSeparator();
        result += "Core Competency: " + (coreCompetency != null && coreCompetency.getValue() != null && !coreCompetency.getValue().isEmpty() ? coreCompetency.getValue() : "Data not available") + System.lineSeparator();
       // result += System.lineSeparator();
       //result += System.lineSeparator();
        return result;
    }
}