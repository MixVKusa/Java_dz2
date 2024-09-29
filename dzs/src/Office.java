public class Office {
    public String title;
    public Employee boss;

    public Office(String title, Employee boss) {
        this.title = title;
        this.boss = boss;
    }

    public Office(String title) {
        this.title = title;
    }
}
