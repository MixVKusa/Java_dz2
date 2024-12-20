package ru.tataev.society;

import ru.tataev.calculating.Comparable;
import ru.tataev.calculating.Save;
import ru.tataev.calculating.Saveable;

import java.util.*;

public class Student implements Comparable<Student>, Saveable {
    private String name;
    private List<Integer> marks;
    private Deque<UndoActionable> funList = new ArrayDeque<>();

    public Student(String name) {
        this(name, new ArrayList<>());
    }

    public Student (String name, Integer...marks){
        this(name, new ArrayList<>(Arrays.asList(marks)));
    }
    public Student(String name, List<Integer> marks) {
        setName(name);
        for (int i = 0; i < marks.size(); i++){
            if (marks.get(i) < 2 || marks.get(i) > 5){
                throw new IllegalArgumentException("Every mark must be in range from 2 to 5");
            }
        }
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setName(String name) {
        String s = this.name;
        this.name = name;
        funList.push(() -> this.name = s);
    }

    public void removeMark(){
        if (marks.isEmpty()) return;
        int m = marks.getLast();
        marks.removeLast();
        funList.push(() -> marks.add(m));
    }

    public void addMark(int score){
        if (score < 2 || score > 5){
            throw new IllegalArgumentException("Every mark must be in range from 2 to 5");
        }
        marks.add(score);
        funList.push(() -> marks.removeLast());
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

    public void undo(){
        if (funList.isEmpty()) return;
        funList.peek().action();
    }

    public Save save(){
        Student saved = new Student(this.name, this.marks);
        return
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

    @Override
    public int compare(Student obj) {
        if (this.average() > obj.average()){
            return 1;
        }
        else if (this.average() == obj.average()){
            return 0;
        }
        else {
            return -1;
        }
    }

    private class StudentData{
        String name = Student.this.name;
        List<Integer> marks = Student.this.marks;
    }

    private interface UndoActionable{
        void action();
    }
}
