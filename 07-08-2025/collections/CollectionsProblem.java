package collections;

import java.util.*;

public class CollectionsProblem {
    public void shuffling(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.shuffle(list);
        System.out.println("After shuffling: "+list);
    }

    public List<Integer> extract(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Extracted portion: "+list.subList(0,2));
        return list.subList(0,2);
    }

    public void replacing(){
        List<String> list = new ArrayList<>();
        list.add("Sunil");
        list.add("Shiva");
        list.add("Yogi");
        list.add("Kedarnath");
        list.set(1,"Nithin");
        System.out.println("After Replacing:"+list);
    }

    public void cloning(){
        HashSet<String> set = new HashSet<>();
        set.add("Raju");
        set.add("Bharath");
        set.add("Akash");
        set.add("Akaza");
        Set<String> clonedSet = (Set<String>) set.clone();
        System.out.println("ClonedSet: "+clonedSet);
    }
    public void convert(){
        HashSet<String> set = new HashSet<>();
        set.add("Shan");
        set.add("Shona");
        set.add("Priya");
        set.add("Kajal");
        TreeSet<String> convertSet = new TreeSet<>(set);
        System.out.println("Converted Set:"+convertSet);
    }
    public void keyscollections(){
        HashMap<String,String> states = new HashMap<>();
        states.put("Telangana","Hyderabad");
        states.put("Maharashtra","Mumbai");
        states.put("Karnataka","Bangalore");
        Set<String> keys = states.keySet();
        System.out.println("Keys contained in the map: "+keys);
    }
    public static void main(String[] args) {
        CollectionsProblem cp = new CollectionsProblem();
        cp.shuffling();
        cp.extract();
        cp.replacing();
        cp.cloning();
        cp.convert();
        cp.keyscollections();
    }
}
