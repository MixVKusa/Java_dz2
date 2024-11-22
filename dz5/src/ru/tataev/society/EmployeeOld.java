package ru.tataev.society;

public class EmployeeOld {
    private String name;
    private OfficeOld place;

    public EmployeeOld(String name, OfficeOld place) {
        this.name = name;
        this.place = place;
        place.add(this);
    }

    public OfficeOld getPlace() {
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
