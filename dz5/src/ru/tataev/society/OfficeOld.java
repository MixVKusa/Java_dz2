package ru.tataev.society;

import java.util.ArrayList;
import java.util.List;

public class OfficeOld {
    private String title;
    private EmployeeOld boss;
    private List<EmployeeOld> employees = new ArrayList<>();

    public OfficeOld(String title, EmployeeOld boss) {
        this.title = title;
        this.boss = boss;
    }

    public OfficeOld(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public EmployeeOld getBoss() {
        return boss;
    }

    public List<EmployeeOld> getEmployees() {
        return employees;
    }

    public void setBoss(EmployeeOld boss) {
        if (boss.getPlace() != this){
            throw new IllegalArgumentException("Boss not in this department");
        }
        this.boss = boss;
    }

    public void add(EmployeeOld employee){
        employees.add(employee);
    }

    public String toString() {
        String res = "Работники отдела " + title + ": ";
        for (int i = 0; i < employees.size(); i++){
            res += employees.get(i).getName();
            if (i < employees.size() - 1){
                res += ", ";
            }
        }
        return res;
    }
}
