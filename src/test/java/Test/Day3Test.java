package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3Test {

    @Test(dependsOnMethods = {"demo9", "demo7"})
    public void demo5() {
        System.out.println("hello");
    }

    @Test(dataProvider = "getData")
    public void demo6(String Username, String Password) {
        System.out.println("kella lelooooooo");
        System.out.println("Username - " + Username);
        System.out.println("Password - " + Password);
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

    @DataProvider
    public Object[][] getData() {

        Object[][] data = new Object[3][2];
        
      //1st combination - username, password - good credit history = row 
     //2nd - username , password - no credit history 
     //3rd - fradulent credit history

        data[0][0] = "firstsetUsername";
        data[0][1] = "password";

        data[1][0] = "secondUsername";
        data[1][1] = "secondPassword";

        data[2][0] = "thirdUsername";
        data[2][1] = "thirdPassword";

        return data;
    }
}
    
//    package Test;
//
//    import org.testng.annotations.DataProvider;
//    import org.testng.annotations.Test;
//
//    public class Day3Test {
//
//        @Test(dependsOnMethods = {"demo6", "demo7"})
//        public void demo5() {
//            System.out.println("hello");
//        }
//
//        @Test(dataProvider = "getData")
//        public void demo6(String username, String password) {
//            System.out.println("kella lelooooooo");
//            System.out.println("Username - " + username);
//            System.out.println("Password - " + password);
//        }
//
//        @Test
//        public void demo7() {
//            System.out.println("ollo");
//        }
//
//        @Test(enabled = false)
//        public void demo8() {
//            System.out.println("pllo");
//        }
//
//        @Test
//        public void demo9() {
//            System.out.println("Tllo");
//        }
//
//        @DataProvider
//        public Object[][] getData() {
//
//            Object[][] data = new Object[3][2];
//
//            // 1st set
//            data[0][0] = "user1@gmail.com";
//            data[0][1] = "Password@123";
//
//            // 2nd set
//            data[1][0] = "user2@gmail.com";
//            data[1][1] = "Password@456";
//
//            // 3rd set
//            data[2][0] = "user3@gmail.com";
//            data[2][1] = "Password@789";
//
//            return data;
//        }
//    }
//    
//    
//    public static void main(String[] args) {
//
//        TestNG testng = new TestNG();
//
//        testng.setTestSuites(List.of("TestNG.xml"));
//
//        testng.run();
//    }
//}