package inheritance;

public class Child extends Parent
{
	
	
	public void bike()
	{
		System.out.println("Bike method from child class");
	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.home();//parent class method
		
		c.car();//parent class method
		
		c.furniture();//parent class method
		
		surname();// parent class method
		
		c.bike();// child class method
		
		c.farm();//grandparent classs method
		
		
	}

}
