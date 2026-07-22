package Test;

import org.testng.annotations.Test;

public class Day2NormalTest {

    @Test
    public void demo3() {
        System.out.println("Test 123");
    }

    @Test(groups= {"Smoke"})
    public void demo4() {
        System.out.println("Test ABC");
    }
}