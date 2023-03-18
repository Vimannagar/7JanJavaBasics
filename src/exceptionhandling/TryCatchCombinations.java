package exceptionhandling;

public class TryCatchCombinations {
	
	
	
	public static void main(String[] args) {
		
	int a [] = {1, 2, 3, 4, 5};
	
	try {
	
		
		int b = 10/0;
		a[5] = 60;
		
		
	System.out.println("a[5] line");
	}
	
	

	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception arrived in try");
		
	}
	
	catch(NullPointerException e)
	{
		System.out.println("Arithmetic exception arrived");
	}
	

	catch(RuntimeException e)
	{
		System.out.println("Runtime exception");
	}
	
	
	
	
	
	System.out.println(a[0]);
	

	}

}
