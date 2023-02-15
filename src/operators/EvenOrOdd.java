package operators;

public class EvenOrOdd {
	
	
	public static void main(String[] args) {
		int a = 13;
		
		int b = a%2;
		
		boolean s = b==0;
		
		if(s)
		{
			System.out.println(a+" is an even number");
		}
		else
		{
			System.out.println(a+" is an odd number");
		}
		
	}

}
