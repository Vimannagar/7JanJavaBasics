package casting;

public class Child extends Parent {
	
	
	public void bike()
	{
		System.out.println("bike method from parent class");
	}
	
	
	public void marry()
	{
		System.out.println("child class marry method");
	}
	
	public static void main(String[] args) 
	{
		
		Child c = new Child();
		
		Parent p1 = (Parent)c;//UP casting
		
		p1.car();// parent class car
		
		p1.home();// parent class home
		
		p1.marry();// child class marry
		
		
		Parent p = new Parent();
		
		
//		Child c1 = (Child)p;
		
//		c1.bike();//Class Cast Exception
		
		
		Child c3 = (Child)p1;// Down casting
		
		c3.bike();
		
		
		
	}

}
