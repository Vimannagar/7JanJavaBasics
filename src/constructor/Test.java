package constructor;

public class Test {
	
	
	
//	syntax of constructor-
	
//	access_modifier classname()
//	{
//		actions to be performed
//	}
	
	
	
	public Test()
	{
		System.out.println("zero argument constructor");
	}
	
	public Test(int i)
	{
		System.out.println("one argument constructor");
	}
	
	public Test(int i, String s)
	{
		System.out.println("two argument constructor");
		
		System.out.println(i);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Test t1 = new Test();
		
		System.out.println("**************************************");
		
		Test t2 = new Test(90, "stringvalue");
		
		
	
		
		
		
		
	
		
	}

}
