public class Student {
    public String name;
    public int[] marks;

    public Student(String name) {
        this(name, new int[]{});
    }

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        String arrStr = "[";
        for (int i = 0; i < marks.length; i++){
            arrStr += marks[i];
            if (i < marks.length - 1){
                arrStr += ", ";
            }
        }
        arrStr += "]";
        String res = String.format("%s:%s", name, arrStr);
        return res;
    }
}
