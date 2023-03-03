package polymorphism;

public class D extends C{
	public void m1()
	{
		System.out.println("m1 method from D class");
	}
	
	
	
	public void m2()
	{
		System.out.println("m2 method from D class");
	}
	
	public static void main(String[] args) {
		
		
		C c = new C();// parent object
		
		c.m1();//C class method
		
		c.m2();// C class m2 method
		
		c.m3(); // C class m3 method 
		
		
		D d = new D();// child object
		
		d.m1();// D class method
		d.m2(); // D class m2 method
		
		d.m3();// C class m3 method
		
		
		C c1 = new D();// Child object
		
		c1.m1();
		
		c1.m2(); // D child m2 method
		
		c1.m3();// C class m3 method
		
		
		
		
		
		
		
		
		
		
	}

}
