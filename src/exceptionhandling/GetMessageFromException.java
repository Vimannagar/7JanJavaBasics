package exceptionhandling;

public class GetMessageFromException {
	
	
	
	public static void main(String[] args) {
		
		
			try {
		
		int i = 10;
		
		int j = 0;
		
		
		int k = i/j;
		
		}
			catch(ArithmeticException e)
			{
				
				String message = e.getMessage();
				
				System.out.println(message);
			}
			
			
		
	}

}
