public class Human {
    private Naming name;
    private int height;
    private final Human father;

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

        if (name.getSecondName().isEmpty() && father != null && !father.name.getSecondName().isEmpty()){
            name.setSecondName(father.name.getSecondName());
        }

        if (name.getSurname().isEmpty() && father != null){
            name.setSurname(father.name.getFirstName() + "ович");
        }
    }

    public Naming getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Human getFather() {
        return father;
    }

    public void setHeight(int height) {
        if (height <= 0 || height > 500){
            throw new IllegalArgumentException("Height must be in range from 1 to 500");
        }
        this.height = height;
    }

    public String toString() {
        return String.format("%s, %d", name, height);
    }
}
