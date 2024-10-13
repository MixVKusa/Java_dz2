import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public List<Integer> marks;

    public Student(String name) {
        this(name, new ArrayList<>());
    }

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public float average(){
        if (!marks.isEmpty()){
            int marksSum = 0;
            for (int i = 0; i < marks.size(); i++){
                marksSum += marks.get(i);
            }
            return (float)marksSum / (float)marks.size();
        }
        else return 0;
    }

    public boolean isExcellent(){
        for (int i = 0; i < marks.size(); i++){
            if (marks.get(i) != 5) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String arrStr = "[";
        for (int i = 0; i < marks.size(); i++){
            arrStr += marks.get(i);
            if (i < marks.size() - 1){
                arrStr += ", ";
            }
        }
        arrStr += "]";
        String res = String.format("%s:%s", name, arrStr);
        return res;
    }
}
