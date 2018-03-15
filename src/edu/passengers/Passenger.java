package edu.passengers;

public class Passenger {
    private String firstName;
    private String secondName;
    private byte age;
    // public Vehicle currVehicle;

    public Passenger(String fName, String sName, byte age){
        firstName = fName;
        secondName = sName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public byte getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Full name: " + firstName + " " + secondName + "\n"
                + "Age: " + age + "\n";
    }
}
