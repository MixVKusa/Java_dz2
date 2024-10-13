public class Naming {
    public String firstName;
    public String secondName;
    public String surname;

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

    public String toString() {
        String res = String.format("%s %s %s", secondName, firstName, surname);
        return res.strip();
    }
}
