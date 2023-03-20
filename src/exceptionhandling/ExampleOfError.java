package exceptionhandling;

public class ExampleOfError {
	
	public void m1()
	{
		m2();
		System.out.println("m1 method");
	}
	
	public  void m2()
	{
		m1();
		System.out.println("m2 method");
	}
	
	public final static void main(String[] args) {
		
	ExampleOfError ee = new ExampleOfError();
	
	ee.m1();
		
	}

}
