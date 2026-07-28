package Test;

public class Inheritance3 extends Inheritance4{
		
	int a = 3;//class variable
	
	public Inheritance3(int a)//instance variable
	{
		super(a); //parent class constructor is invoked
		this.a = a;//this - refers to the current class variable
	}

	public int increment() {
		
	a = a+3;
	return a;
	
	}
	
	public int decrement() {
		
		a = a-3;
		return a;
	}

}
