package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Nikita",'m',20,3,4);
        Student st2 = new Student("Alisa",'f',18,3,5);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.remove(st1);
        int index = studentList.indexOf(st2);
        System.out.println(studentList);
        System.out.println(index);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student (String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student(" +
                "name='" + name + "\'" +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }
}