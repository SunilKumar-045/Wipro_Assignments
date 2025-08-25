package list;

import java.util.*;
public class Fruits {
    public static void main(String[] args){

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add(1,"Banana");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println("Fruits: "+fruits);

        //get()
        System.out.println("get fruit at index 4:"+fruits.get(4));
        //set()
        fruits.set(1,"strawberry");
        System.out.println(fruits);
        //remove()
        fruits.remove("Guava");
        System.out.println(fruits);
//
//        System.out.println(fruits.contains("apple"));
//        System.out.println(fruits.isEmpty());
//        System.out.println(fruits.size());
//        fruits.clear();
//        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();
        // Traverse the ArrayList using Iterator
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
