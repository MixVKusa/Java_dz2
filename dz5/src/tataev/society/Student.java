package ru.tataev.society;

import ru.tataev.calculating.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private List<Integer> marks;

    public Student(String name) {
        this(name, new ArrayList<>());
    }

    public Student (String name, Integer...marks){
        this(name, new ArrayList<>(Arrays.asList(marks)));
    }
    public Student(String name, List<Integer> marks) {
        this.name = name;
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

    public void addMark(int score){
        if (score < 2 || score > 5){
            throw new IllegalArgumentException("Every mark must be in range from 2 to 5");
        }
        marks.add(score);
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
}
