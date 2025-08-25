import java.util.*;

public class CollectionPractise {


    public void convert(List<String> list){

       String[] names = list.toArray(new String[0]);
        for (String element : names) {
            System.out.println(element);
        }
    }

    public void sub(List<String> list){
        List<String> sublist = list.subList(0,2);
        System.out.println(sublist);
    }
    public void iterate(Map<Integer,Integer> map){
        for(int key:map.keySet()){
            System.out.println(key+" = "+map.get(key));
        }

    }

    public void shuffle(List<String> names){
        System.out.println();
        Collections.shuffle(names);
        System.out.println(names);
    }
    public static void main(String[] args) {
        CollectionPractise cp = new CollectionPractise();
        List<String> list = new ArrayList<>();
        list.add("csk");
        list.add("psk");
        list.add("mrh");
        list.add("raj");
        list.add("ram");
        cp.convert(list);
        cp.sub(list);
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(1,45);
        map.put(2,55);
        map.put(3,65);
        cp.iterate(map);
        cp.shuffle(list);
    }
}
