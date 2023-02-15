package operators;

public class DefineRange {
	
	
	public static void main(String[] args) {
		
		int a  = 18;
		
		if(a>0 && a<=20)
		{
			System.out.println("number is between 0 and 20.");
		}
		else if(a>20 && a<=40)
		{
			System.out.println("number is between 21 and 40.");
		}
		else if(a>40 && a<=60)
		{
			System.out.println("number is between 41 and 60.");
		}
		else
		{
			System.out.println("number is out of range");
		}
		
		
	}

}
