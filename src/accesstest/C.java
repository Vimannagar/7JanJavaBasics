package accesstest;

public class C extends B
{

	public static void main(String[] args) {
		
		B b = new B();
		
//		b.m9(); // as m9 method is protected from A class so can be accessible through child class reference variable inside the child class only.
		
		C c =new C();
		
		c.m9();
		
		B.m10();
		
		C.m10();
		
		
		m10();
		
		
	}
	
	
}
