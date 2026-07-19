package Test;

import org.testng.annotations.Test;
import org.testng.TestNG;
import java.util.List;

public class Day1NormalTest {

    @Test
    public void demo() {
        System.out.println("Hello TestNG");
    }
    
    @Test
    public void demo2() {
    	System.out.println("Bye TestNG");
    }

//    public static void main(String[] args) {
//
//        TestNG testng = new TestNG();
//
//        testng.setTestSuites(
//            List.of("TestNG.xml")
//        );
//
//        testng.run();
// }
}