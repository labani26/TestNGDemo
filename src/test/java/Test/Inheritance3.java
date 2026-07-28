package Test;

public class Inheritance3 {
		
	int a = 3;//class variable
	
	public Inheritance3(int a)//instance variable
	{
		this.a = a;
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
