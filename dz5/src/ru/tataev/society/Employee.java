package ru.tataev.society;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Office dep;

    public Employee(String name) {
        this(name, null);
    }

    public Employee(String name, Office dep) {
        setName(name);
        setDep(dep);
    }

    public String getName() {
        return name;
    }

    public Office getDep() {
        return dep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDep(Office dep) {
        if (dep == null) return;
        if (dep.getThatEmployees().contains(this)) return;
        removeDep();
        this.dep = dep;
        dep.getThatEmployees().add(this);
    }

   protected void removeDep(){
       if (dep == null) return;
       if (!dep.getThatEmployees().contains(this)) return;
       if (dep.getBoss() == this) dep.setBoss(null);
       dep.getThatEmployees().remove(this);
       dep = null;
   }

    @Override
    public String toString() {
        String res;
        if (dep != null && dep.getBoss() == this){
            res = String.format("%s начальник отдела %s", name, dep.getTitle());
        }
        else {
            res = this.name + "работает";
            if (dep == null) return res;
            res += " в отделе";
            if (dep.getTitle() != null){
                res += String.format(" %s", dep.getTitle());
            }
            if (dep.getBoss() != null){
                res += String.format(", начальник которого %s", dep.getBoss().getName());
            }

        }
        return res;
    }
}
