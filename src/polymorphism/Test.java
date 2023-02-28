package polymorphism;

public class Test {
	
	public int i = 50;
	
	public Test()
	{
		System.out.println("Constructor with 0 argument");
	}
	
	public Test(int i)
	{
		System.out.println("Constructor with 1 argument");
	}
	
	public void m1()
	{
		System.out.println("first m1 method");
	}
	
	public void m1(int i)
	{
		System.out.println("Second m1 method");
	}
		
	public static void m1(String s, String t)
	{
		System.out.println("Static m1 method");
	}
	
	
	public int m1(double d)
	{
		System.out.println("mehtod with return type");
		
		return 80;
	}
	
	
	
	
	public static void m1(char c)
	{
		System.out.println("public Static method with char argument");
		
	}
	
	void m1(int a, int b, int c) {
		System.out.println("Default non static method");
	}
	
	private void  m1(double d,  int i)
	{
		System.out.println("private non static method");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		double	d = t.m1(78.52);
	
		System.out.println(d);
	
		t.m1();
	
		t.m1("abc", "abc");
		
	}
}
