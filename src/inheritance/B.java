package inheritance;

public class B extends A{
	
	int c = 50;
	
	int a = 90;
	
	String city = "Delhi";
	
	static String country ="India";
	
	
	public void m1()
	{
		System.out.println("value of a without super keyword = "+a);//90
		System.out.println("value of a with super keyword = "+super.a);//10
		System.out.println(country);//India
		System.out.println(super.country);//USA
		
		System.out.println(super.b);// Pune
	}
	
	
	public void m2()
	{
		System.out.println(city);//Delhi
		System.out.println(super.city);//Uri
	}
	
	public static void main(String[] args) {
		
		B b = new B();
			
		System.out.println(b.a);//90
		
		System.out.println(b.c);//50
		
		System.out.println(d);// mumbai
		
		b.m1();
		b.m2();
		
	}

}
