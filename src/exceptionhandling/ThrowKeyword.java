package exceptionhandling;

public class ThrowKeyword {
	
	
	public static void main(String[] args) {
		boolean c = false;
		
		
		if(c)
		{
			throw new NullPointerException("Something went wrong please try again");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		
	}

}
