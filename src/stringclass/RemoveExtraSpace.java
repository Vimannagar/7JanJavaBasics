package stringclass;

public class RemoveExtraSpace {
	
	
	public static void main(String[] args) {
		
		String s = "This    is         String          of the        Program";
		
		String s1 = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)== ' ') && (s.charAt(i+1)== ' '))
			{
				continue;
			}
			else
			{
				s1 = s1 + s.charAt(i);
			}
		}
		
		System.out.println(s1);
		
		
		
		
	}

}
