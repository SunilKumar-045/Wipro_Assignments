package pkg_comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
public class MultiSorting{
    public static void main(String args[]){

        List<Person> list = Arrays.asList(new Person("Sunil",22),new Person("Shive",25),new Person("Shiva",20));
        System.out.println("--------Before Sorting-----------");
        System.out.println(list);
        list.sort(Comparator.comparing((Person p)->p.getName()).thenComparing((p)->p.getAge()));

        System.out.println("--------After Sorting-----------");
        for(Person person:list){
            System.out.println(person);
        }



    }
}
