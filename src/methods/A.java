package methods;

public class A {
	
//	Calling non static into another non static
	
	public void m1()
	{
		System.out.println("M1 method is executing");
	}
	
	public void m2()
	{
		m1();
		System.out.println("M2 method is executing");
	}
	
	public static void main(String[] args) {
		
		
		A a = new A();
		
		a.m2();
		
	}
	

}
