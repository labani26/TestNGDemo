package Test;

import java.util.List;

import org.testng.TestNG;

public class TestRunner {

    public static void main(String[] args) {

        TestNG testng = new TestNG();
        testng.setTestSuites(List.of("TestNG.xml"));
        testng.run();

    }
}