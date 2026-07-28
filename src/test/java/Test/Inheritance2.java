package Test;


import org.testng.annotations.Test;

public class Inheritance2 extends Inheritance1 {

    @Test
    public void testRun() {
    	
    	Inheritance3 inheritance3 = new Inheritance3(3); //Parameterize constructor
    //	int a = 3;  	
        run(); // parent class  
       System.out.println(inheritance3.increment());
       System.out.println(inheritance3.decrement()); 
       
//       Inheritance4 inheritance4 = new Inheritance4(5);     
//       System.out.println(inheritance4.multiplyTwo()); 
//       System.out.println(inheritance4.multiplyThree());   
       
       System.out.println(inheritance3.multiplyTwo());
       System.out.println(inheritance3.multiplyThree());
       
    }

}