public class Office {
    public String title;
    public Employee boss;
    public Employee[] employees = {};

    public Office(String title, Employee boss) {
        this.title = title;
        this.boss = boss;
    }

    public Office(String title) {
        this.title = title;
    }

    public String toString() {
        String res = "Работники отдела " + title + ": ";
        for (int i = 0; i < employees.length; i++){
            res += employees[i].name;
            if (i < employees.length - 1){
                res += ", ";
            }
        }
        return res;
    }
}
