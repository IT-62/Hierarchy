package edu.passengers;

import edu.options.FireRanks;

public class Fireman extends Passenger {
    private int department;
    private FireRanks rank;

    public Fireman(String fName, String sName, byte age, int department, FireRanks rank) {
        super(fName, sName, age);
        this.department = department;
        this.rank = rank;
    }

    public int getDepartment() {
        return department;
    }

    public FireRanks getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Fireman:\n"
                + super.toString()
                + "Department: " + department + "\n"
                + "Rank: " + rank;
    }
}
