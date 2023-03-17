package exceptionhandling;

public class Test {
	
	public static void main(String[] args) {
//		Syntax
//		try{
//			// risky code – code we think can cause an exception
//			}
//
//			catch(Exceptionname variable)
//			{
//				Code which we want to execute after exception
//			}

		
		
		int a = 10;
		
		int b = 0;
		
		int c;
		
		try {
			
		 c  = a/b;
		
		}
		
		
		
		catch(NullPointerException e)
		{
			System.out.println("This is catch block");
			
			 c = 2;
			
		}
		
		
		
		System.out.println(c);
		
		
	}

}
