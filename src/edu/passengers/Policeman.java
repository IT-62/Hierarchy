package edu.passengers;

import edu.options.PoliceRanks;

public class Policeman extends Passenger {
    private int department;
    private PoliceRanks rank;

    public Policeman(String fName, String sName, byte age, int department, PoliceRanks rank) {
        super(fName, sName, age);
        this.department = department;
        this.rank = rank;
    }

    public int getDepartment() {
        return department;
    }

    public PoliceRanks getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Policeman:\n"
                + super.toString()
                + "Department: " + department + "\n"
                + "Rank: " + rank;
    }
}
