package polymorphism;

public class StaticB extends StaticA

{
	
	public static void m1()
	{
		System.out.println("m1 method from Static B class");
	}
	
	
	public static void main(String[] args) {
		
		StaticA a = new StaticA();
		
		a.m1();
		
		StaticB b = new StaticB();
		
		b.m1();
		
		StaticA sa = new StaticB();
		
		sa.m1();
		
		
		
		
	}
	
	

}
