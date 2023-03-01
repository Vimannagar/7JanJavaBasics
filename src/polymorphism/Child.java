package polymorphism;

public class Child extends Parent {

	public void bike()
	{
		System.out.println("Child class bike");
	}
	
	public void marry()
	{
		System.out.println("Child class marry method");
	}

	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.home();
		
		c.car();
		
		c.bike();
		
		c.marry();
	}
	
	
	
}
