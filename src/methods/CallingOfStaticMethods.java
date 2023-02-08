package methods;

public class CallingOfStaticMethods {

	
	public static void m1()
	{
		System.out.println("m1 method is executing");
	}
	
	public static void m2()
	{
		CallingOfStaticMethods.m1();
		
		System.out.println("m2 method is executing");
	}
	
	public void m3()
	{
		m1();
	}
	
	public static void main(String[] args) {
		
		m2();
		
	}
}
