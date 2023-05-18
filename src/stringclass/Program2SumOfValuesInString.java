package stringclass;

public class Program2SumOfValuesInString {
	
	
	public static void main(String[] args) {
		
		
		String s = "23sdsd3sdf23s8d45ddsf55";
		boolean flag = false;
		String number = "";
		
		int sum= 0;
		
		for(int i= 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				number = number + ch;
				
				flag = true;
				
				if(i!=(s.length()-1))
				{
					continue;
				}
				
			}
			
			if(flag)
			{
				int value = Integer.parseInt(number);
				
				sum = sum + value;
				
				flag = false;
				
				number = "";
			}
		}
		
		System.out.println(sum);
	}
	
	

}
