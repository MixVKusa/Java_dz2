public class Employee {
    private String name;
    private Office place;

    public Employee(String name, Office place) {
        this.name = name;
        this.place = place;
        place.add(this);
    }

    public Office getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String res;
        if (this == place.getBoss()) {
            res = String.format("%s начальник отдела %s", name, place.getTitle());
        } else {
            res = String.format("%s работает в отделе %s, начальник которого %s", name, place.getTitle(), place.getBoss().name);
        }
        return res;
    }
}
