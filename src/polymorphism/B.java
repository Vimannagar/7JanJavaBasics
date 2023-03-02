package polymorphism;

public class B extends A {
	
//	return type for overriding must be same for methods inside the parent and child class
	
	public int m1()
	{
		System.out.println("m1 method from B class");
		
		return 90;
	}
	
	
//	method having different type cannot  be overridden
	
	public  void m2()
	{
		System.out.println("static method m2 from B class");
	}
	
	public void m3()
	{
		System.out.println("default non static method m3 from B class");
	}
	
	
	

}
