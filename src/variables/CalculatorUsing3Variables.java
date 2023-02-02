package variables;

public class CalculatorUsing3Variables {

	static int a = 10;
	static int b = 20;
	static int c = 0;

	public static void addition() {
		c = a + b;

		System.out.println(c);

	}

	public static void substraction() {
		a = 5;
		b = 2;

		c = a - b;

		System.out.println(c);

	}
	
	public static void multiplication()
	{	
		a = 10;
		b = 2;
		c = a*b;
		
		System.out.println(c);
		
	}
	
	public static void division()
	{	
		a = 10;
		
		b = 2;
		
		c = a/b;
		
		System.out.println(c);
		
	}
	
	
	public static void main(String[] args) {
		
		addition();
		
		multiplication();
		
		division();
		
		substraction();
		
	}
	

}
