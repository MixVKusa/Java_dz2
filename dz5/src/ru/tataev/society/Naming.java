package ru.tataev.society;

public class Naming {
    private final String firstName;
    private String secondName;
    private String surname;

    public Naming(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }

    public Naming(String firstName, String secondName) {
        this(firstName, secondName, "");
    }

    public Naming(String firstName) {
        this(firstName, "", "");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        String res = String.format("%s %s %s", secondName, firstName, surname);
        return res.strip();
    }
}
