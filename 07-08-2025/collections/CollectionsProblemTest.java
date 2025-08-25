package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsProblemTest {

    CollectionsProblem cp = new CollectionsProblem();
    @Test
    public void extract() {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = cp.extract();
        list.add(1);
        list.add(2);
        Assert.assertEquals(list,list1);

    }
}