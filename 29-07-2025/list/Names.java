package list;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Names {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();

        names.add("Sunil");
        names.add("Shiva");
        names.add("Yogi");
        names.add("Kedar");
        names.add("Tarun");
        names.add("Shiva");
//        names.add(null);

        System.out.println("Before Sorting: "+names);
        Collections.sort(names);
        System.out.println("After Sorting"+names);

    }

}
