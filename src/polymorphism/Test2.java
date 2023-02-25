package polymorphism;

public class Test2 extends Test
{

	public void m1(boolean h)
	{
		System.out.println("Boolean argument m1 method");
	}
	
	public static void main(String[] args) {
		
		
		Test2 t2 = new Test2();
		
		t2.m1(false);
		
		t2.m1();
		
		main();
	}
	
	public static void main()
	{
		System.out.println("main method with no argument");
	}
	
	
	
}
