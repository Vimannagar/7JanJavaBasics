package accessmodifiers;

public class Test4 {
	
	
	
	public void m1()
	{
		System.out.println("public Non static method m1 from Test4 class");
	}
	
	public static void m2()
	{
		System.out.println("public static method m2 from Test4 class");
	}

	void m3()
	{
		System.out.println("default m3 non static method from Test4 class");
	}
	
	static void m4()
	{
		System.out.println("default m4 static method from Test4 class");
	}
	
	
	private void m5()
	{
		System.out.println("private m5 non static method from Test4 class");
	}
	
	private static void m6()
	{
		System.out.println("private m6  static method from Test4 class");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		m6();
		
		Test4 t4 = new Test4();
		t4.m5();
	}
	
}
