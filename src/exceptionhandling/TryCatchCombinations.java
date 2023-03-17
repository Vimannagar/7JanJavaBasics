package exceptionhandling;

public class TryCatchCombinations {
	
	
	
	public static void main(String[] args) {
		
	int a [] = {1, 2, 3, 4, 5};
	
	try {
	
		a[5] = 60;
		int b = 10/0;
		
		
		
	System.out.println("a[5] line");
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception arrived in try");
		
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic exception arrived");
	}
	
	
	
	System.out.println(a[0]);
	

	}

}
