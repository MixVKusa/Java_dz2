public class Human {
    public Naming name;
    public int height;
    public Human father;

    public Human(Naming name, int height) {
        this.name = name;
        this.height = height;
    }

    public Human(Naming name, int height, Human father) {
        this.name = name;
        this.height = height;
        this.father = father;

        if (name.secondName.isEmpty() && father != null && !father.name.secondName.isEmpty()){
            name.secondName = father.name.secondName;
        }

        if (name.surname.isEmpty() && father != null){
            name.surname = father.name.firstName + "ович";
        }
    }

    public String toString() {
        return String.format("%s, рост: %d", name, height);
    }
}
