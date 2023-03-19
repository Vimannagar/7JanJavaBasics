package exceptionhandling;

public class Checked2 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("first line");
		try {
			
		Thread.sleep(5000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Exception arrived");
		}
		
		System.out.println("second line");
	}

}
