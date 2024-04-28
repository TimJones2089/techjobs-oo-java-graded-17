
package org.launchcode.techjobs.oo;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.SplittableRandom;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }


//    Add toString() method.

    @Override
    public String toString() {

        String aID = "ID: " + id;
        String aName;
        String aEmployer;
        String aLocation;
        String aPositionType;
        String aCoreCompetency;

//      Check if field is null and then assign it a desired string.

        if (this.name == null || this.name.isEmpty()){
            aName =  "Name: Data not available";
        } else {
            aName = "Name: "+ name;
        }
        if (this.employer == null || this.employer.toString().isEmpty()){
            aEmployer =  "Employer: Data not available";
        } else {
            aEmployer = "Employer: "+ employer;
        }
        if (this.location == null || this.location.toString().isEmpty()){
            aLocation =  "Location: Data not available";
        } else {
            aLocation = "Location: "+ location;
        }
        if (this.positionType == null || this.positionType.toString().isEmpty()){
            aPositionType =  "Position Type: Data not available";
        } else {
            aPositionType = "Position Type: "+ positionType;
        }
        if (this.coreCompetency == null || this.coreCompetency.toString().isEmpty()){
            aCoreCompetency =  "Core Competency: Data not available";
        } else {
            aCoreCompetency = "Core Competency: "+ coreCompetency;
        }

//      Return the structure of the string with all desired fields.

        return lineSeparator() +
                aID +
                lineSeparator() +
                aName +
                lineSeparator() +
                aEmployer +
                lineSeparator() +
                aLocation+
                lineSeparator() +
                aPositionType +
                lineSeparator() +
                aCoreCompetency +
                lineSeparator();
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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


}

