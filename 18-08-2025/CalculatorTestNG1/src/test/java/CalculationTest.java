import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculationTest {

    Calculation cal ;

    @BeforeMethod(groups = "addition")
    public void setup(){
        cal = new Calculation();
    }
//    @Test(groups = "addition")
    public void testsub(){
        int result = cal.sub(5,3);
        assertEquals(2,result);
    }
//    @Test(groups = "addition")
    public void testadd(){
        int result = cal.add(5,5);
        assertEquals(10,result);
    }


    @Test(groups = "sub")
    public void testmul(){
        int result = cal.mul(5,5);
        assertEquals(25,result);
    }
    @Test(groups = "sub")
    public void testdiv(){
        int result = cal.div(4,2);
        assertEquals(2,result);
    }
}
