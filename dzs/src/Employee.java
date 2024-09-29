public class Employee {
    public String name;
    public Office place;

    public Employee(String name, Office place) {
        this.name = name;
        this.place = place;
    }

    public String toString() {
        String res;
        if (!name.equals(place.boss.name)){
            res = String.format("%s работает в отделе %s, начальник которого %s", name, place.title, place.boss.name);
        }
        else{
            res = String.format("%s начальник отдела %s", name, place.title);
        }
        return res;
    }
}
