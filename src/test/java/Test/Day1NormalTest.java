package Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
//import org.testng.TestNG;
//import java.util.List;

public class Day1NormalTest {

    @Test
    public void demo() {
        System.out.println("Hello TestNG");
    }
    
    @Test
    public void demo2() {
    	System.out.println("Bye TestNG");
    }
    
    @BeforeTest  
    public void BeforeTest() {
    	System.out.println("I will execute First");
    }
    
    @AfterTest
    public void AfterTest() {
    	System.out.println("I will execute Last");
    }
    
    @BeforeSuite
    public void BeforeSuite() {
    	System.out.println("I will execute before suite");
    }
    
    @AfterSuite
    public void AfterSuite() {
    	System.out.println("I will execute after suite");
    }
    
    @BeforeMethod
    public void BeforeMethod() {
    	System.out.println("I will execute before method");
    }
    
    @AfterMethod
    public void AfterMethod() {
    	System.out.println("I will execute after method");
    }
    
//    @BeforeTest → Runs once before the <test> section in testng.xml.
//    @BeforeMethod → Runs before every @Test method in the class.

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