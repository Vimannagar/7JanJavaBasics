package interfacediscussion;

public class Test3 {
	
	static int i = 50;
	
	static final int a = 90;
	
	
	public void m1(Object o)
	{
		System.out.println("Object method");
	}
	
	public void m1(String s)
	{
		System.out.println("String method");
	}
	
	public static void main(String[] args) {
		
	Test3 t3 = new Test3();
	
	t3.m1(false);
	
	
		
		
	}

}
