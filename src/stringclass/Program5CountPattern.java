package stringclass;

public class Program5CountPattern {
	
	
	public static void main(String[] args) {
		
		String s = "abcdfjkdshdkashdjsakdhksjdhabckajhdjabcahdsadhkasdhdjkashabcef";
		
		int count =0;
		
		String [] sarray = new String[s.length()-2];
		
		String pattern = "abc";
		
//		s.substring(0, 3); s.substring(1, 4); s.substring(2, 5);
		
		int end = 3;
		for(int start=0; end<=s.length(); start++)
		{
			String s1 = s.substring(start, end);
			
			sarray[start]	= s1;
		
			end++;
			
			
		}
		
		
		for(int i=0; i<sarray.length; i++ )
		{
			if(sarray[i].equals(pattern))
			{
				count = count+1;
				
			}
		}
		
		System.out.println(pattern+ " is repeating "+count+" times");
		
		
		
	}

}
