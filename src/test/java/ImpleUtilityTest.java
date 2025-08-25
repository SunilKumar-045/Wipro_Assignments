import main.UtilityClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpleUtilityTest {

UtilityClass util = new UtilityClass();
    @Test
    public void addtest() {
        int actual =util.add(5,5);
        Assertions.assertEquals(10,actual);
    }
    @Test
    public void subtest() {
        int actual =util.sub(5,5);
        Assertions.assertEquals(0,actual);
    }
    @Test
    public void multest() {
        int actual =util.mul(5,5);
        Assertions.assertEquals(25,actual);
    }
    @Test
    public void divtest() {
        int actual =util.div(10,5);
        Assertions.assertEquals(2,actual);
    }
}