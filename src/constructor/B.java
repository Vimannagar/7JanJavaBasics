package constructor;

public class B {
	
//	Calling of one constructor into another one
	
	public B()
	{
		this("hello");
		this (45.58, false);// this is not valid as we can call only one constructor inside another and that too in first line of the constructor only.
		System.out.println("Zero argument constructor");
	
	}
	

	public B(String s)
	{
		System.out.println("one argument constructor");
	}
	
	public B(double d, boolean f)
	{
		System.out.println("two argument constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		B a = new B();
		
	}
	
	
	
}
