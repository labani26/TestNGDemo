package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2NormalTest {

    @Parameters({"URL"})
    @Test
    public void demo3(String abcname) {
        System.out.println("Test 123");
        System.out.println(abcname);
    }

    @Test(groups = {"Smoke"})
    public void demo4() {
        System.out.println("Test ABC");
    }
}