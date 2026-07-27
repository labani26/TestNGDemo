package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("I Started Listen");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I Successfully Listen");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I failed to Listen");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I Skipped to Listen");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("I FailedButWithinSuccessPercentage Listen");
	}
	
	}


