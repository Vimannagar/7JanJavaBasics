package variables;

public class Test1 {
	
	
	int i =20;
	int j = 50;
	
	static int k = 90;
 
	
	public void m1()
	{
		Test1 t1 = new Test1();
		
		System.out.println(t1.j);
	}
	
	public static void m2()
	{
		Test1 t1 = new Test1();
		
		System.out.println(t1.i);
		
		System.out.println(k);
	}
 
 

}
