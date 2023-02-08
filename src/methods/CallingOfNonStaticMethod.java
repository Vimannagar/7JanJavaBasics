package methods;

public class CallingOfNonStaticMethod {
	
	public void m1()
	{
		System.out.println("m1 is executing");
	}
	
	public static void m2()
	{
		CallingOfNonStaticMethod cons = new CallingOfNonStaticMethod();
		
		cons.m1();
	}
	
	public static void main(String[] args) {
		m2();
	}

}
