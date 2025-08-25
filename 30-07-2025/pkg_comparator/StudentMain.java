package pkg_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String args[]){

        List<Student> list = new ArrayList<>();

        list.add(new Student(22,"Sunil"));
        list.add(new Student(23,"Shiva"));
        list.add(new Student(20,"Yogi"));
        list.add(new Student(25,"Akhil"));
        list.add(new Student(21,"Kedar"));

        System.out.println("-----------Before Sorting Ages------------");
        for(Student student : list){
            System.out.println(student.getAge());
        }
//
//        Collections.sort(list,new AgeComparator());
//        System.out.println("-----------After Sorting Ages------------");
//        for(Student student : list){
//            System.out.println(student.getAge());
//        }
//
        System.out.println("-----------Before Sorting Names------------");
        for(Student student : list){
            System.out.println(student.getName());
        }
//
//        Collections.sort(list,new NameComparator());
//        System.out.println("-----------After Sorting Names------------");
//        for(Student student : list){
//            System.out.println(student.getName());

        //Anonymous class comaprable

        System.out.println("-----------After Sorting Ages Anonyomus Class------------");
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(),s2.getAge());
            }
        });

        for(Student student : list){
            System.out.println(student.getAge());
        }

        System.out.println("-----------After Sorting Names Anonyomus Class------------");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        for(Student student : list){
            System.out.println(student.getName());
        }

        System.out.println("-----------After Sorting Ages Lambda------------");

        //Lambda Expressions
        list.sort((s1,s2)->Integer.compare(s1.getAge(),s2.getAge()));
        list.forEach(System.out::println);

        System.out.println("-----------After Sorting Names Lambda------------");

        list.sort((s1,s2)->s2.getName().compareTo(s1.getName()));
        list.forEach(System.out::println);


    }

    }

