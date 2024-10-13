public class Employee {
    public String name;
    public Office place;

    public Employee(String name, Office place) {
        this.name = name;
        this.place = place;
        Employee[] newEmployees = new Employee[place.employees.length + 1];
        System.arraycopy(place.employees, 0, newEmployees, 0, place.employees.length);
        newEmployees[place.employees.length] = this;
        place.employees = newEmployees;
    }

    public String toString() {
        String res;
        if (this == place.boss) {
            res = String.format("%s начальник отдела %s", name, place.title);
        } else {
            res = String.format("%s работает в отделе %s, начальник которого %s", name, place.title, place.boss.name);
        }
        return res;
    }
}
