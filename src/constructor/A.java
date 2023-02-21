package constructor;

public class A {
	
//	Calling of one constructor into another one
	
	public A()
	{
		
		System.out.println("Zero argument constructor");
//		this("hello");// this is not valid as we are calling the constructor at other than 1 line
		
		
	}
	

	public A(String s)
	{
		System.out.println("one argument constructor");
	}
	
	public A(double d, boolean f)
	{
		System.out.println("two argument constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		A a = new A();
		
	}
	
	
	
}
