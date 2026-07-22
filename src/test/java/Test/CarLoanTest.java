package Test;

import org.testng.annotations.Parameters;
//import java.util.List;
//
//import org.testng.TestNG;
import org.testng.annotations.Test;

public class CarLoanTest {
	
	@Parameters({"URL"})
	@Test
	public void CarTest(String urlname) {
		
		System.out.println("Car Loan Test");
		System.out.println(urlname);
		
	}
	
	@Test
	public void CarWebtest() {
		
		System.out.println("Car Web Test");
		
	}
	
	@Test
		public void CanAutoTest() {
			
			System.out.println("Car Auto Test");
			
		}
		
//		public static void main(String[] args) {
//
//	        TestNG testng = new TestNG();
//
//	        testng.setTestSuites(
//	            List.of("TestNG.xml")
//	        );
//
//	        testng.run();
//		}
}
