import java.util.ArrayList;
import java.util.List;

public class Office {
    private String title;
    private Employee boss;
    private List<Employee> employees = new ArrayList<>();

    public Office(String title, Employee boss) {
        this.title = title;
        this.boss = boss;
    }

    public Office(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Employee getBoss() {
        return boss;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setBoss(Employee boss) {
        if (boss.getPlace() != this){
            throw new IllegalArgumentException("Boss not in this department");
        }
        this.boss = boss;
    }

    public void add(Employee employee){
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
