package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String studentName;
    private int age;
    private long phno;

    public Student(int age, String studentName,long phno) {
        this.age = age;
        this.studentName = studentName;
        this.phno = phno;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", phno=" + phno +
                '}';
    }
}
