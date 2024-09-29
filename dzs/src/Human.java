public class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("%s, рост: %d", name, age);
    }
}
