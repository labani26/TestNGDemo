package Test;

//import java.util.List;
//
//import org.testng.TestNG;
import org.testng.annotations.Test;

public class Day3Test {

	@Test(dependsOnMethods = {"demo6", "demo7"})
	public void demo5() {
	    System.out.println("hello");
	}

    @Test
    public void demo6() {
        System.out.println("kello");
    }

    @Test
    public void demo7() {
        System.out.println("ollo");
    }
    
    @Test(enabled = false)
    public void demo8() {
        System.out.println("pllo");
    }
    
    @Test
    public void demo9() {
        System.out.println("Tllo");
    }
    
    
//    public static void main(String[] args) {
//
//        TestNG testng = new TestNG();
//
//        testng.setTestSuites(List.of("TestNG.xml"));
//
//        testng.run();
//    }
}