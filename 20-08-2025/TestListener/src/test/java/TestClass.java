import jdk.jfr.Enabled;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TestClass {

    @Test
    public void testSuccess() {
        System.out.println("Executing testSuccess...");
    }

    @Test
    public void testFail() {
        System.out.println("Executing testFail...");
        assert false;
    }

//    @Test
//    public void testSkip() {
//        boolean DataAvailable = false;
//        System.out.println("Test Case3 - Conditional Skip");
//        if(!DataAvailable)throw new
//                SkipException("Skipping this exception");
//    }


}