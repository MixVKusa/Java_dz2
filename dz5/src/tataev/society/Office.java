package ru.tataev.society;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private String title;
    private Employee boss;
    private final List<Employee> employees = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public Employee getBoss() {
        return boss;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    protected List<Employee> getThatEmployees(){
        return employees;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
        if (boss.getDep() != this){
            boss.setDep(this);
        }
    }
}
