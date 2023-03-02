package polymorphism;

public class D extends C{
	public void m1()
	{
		System.out.println("m1 method from D class");
	}
	
	public static void main(String[] args) {
		
		
		C c = new C();// parent object
		
		c.m1();//C class method
		
		
		D d = new D();// child object
		
		d.m1();// D class method
		
		
		C c1 = new D();// Child object
		
		c1.m1();// D class method
		
		
		
		
		
		
		
		
		
		
		
	}

}
