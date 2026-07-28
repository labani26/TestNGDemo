package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Inheritance1 {

	public static void run() {
		
		System.out.println("Hello world!");

	}
	
	@BeforeMethod
    public void beforeRun() {
        System.out.println("I will run first");
        System.out.println("------------------");
    }
	

    @AfterMethod
    public void afterRun() {
        System.out.println("I will run last");
        System.out.println("------------------");
    }

}
