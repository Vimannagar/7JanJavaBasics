package conditionalstatement;

public class ElseIfStatements {
	
	public static void main(String[] args) {
		
//		syntax:
			
//			if(boolean_condition1)
//			{
//				// will execute if condition1 gets true
//			}
//			
//			else if (boolean_condition2) {
//				
//				// will execute if condition2 gets true
//				
//			}
//		
//			else if (boolean_condition3) {
//				
//				// will execute if condition3 gets true
//				
//			}
//			else
//			{
////				when no condition gets match
//			}
		
		
		int a = 20;
		
		int b = 30;
		
		
		if(a>30)
		{
			System.out.println("a is greater than 30");
		}
		
		else if(b<20)
		{
			System.out.println("b is less than 20");
		}
		
		else if(a>15)
		{
			System.out.println("a is greater than 15");
		}
		
		else if(b>15)
		{
			System.out.println("b is greater than 15");
		}
		
		else
		{
			System.out.println("Else is executing hence no match");
		}
		
		
	}

}
