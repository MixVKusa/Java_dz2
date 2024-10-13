public class Human {
    public Naming name;
    public int height;
    public Human father;

    public Human(Naming name, int height) {
        this(name, height, null);
    }

    public Human(String name, int height) {
        this(new Naming(name), height, null);
    }

    public Human(String name, int height, Human father) {
        this(new Naming(name), height, father);
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
        return String.format("%s, %d", name, height);
    }
}
