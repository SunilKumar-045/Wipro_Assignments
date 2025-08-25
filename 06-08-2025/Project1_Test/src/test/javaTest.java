package test;

import main.Calculate;
import org.junit.Assert;
import org.junit.Test;
public class javaTest {

    Calculate c = new Calculate();

    @Test
    public void add() {
        Assert.assertEquals(5,c.add(2,3));
    }

    @Test
    public void mul() {
        Assert.assertEquals(6,c.mul(2,3));
    }
}