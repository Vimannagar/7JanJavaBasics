package exceptionhandling;

public class TryCatchFinally {
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
		
		int a [] = {1, 2};
		
		
		System.out.println(a[0]);
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			String message = e.getMessage();
			
			System.out.println(message);
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
		
	}

}
