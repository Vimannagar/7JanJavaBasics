package stringclass;

public class Program3CountACharacterFromString {
	
	public static void main(String[] args) {
		
		String s = "hhshkjshdkshdsjkdsa";
		int count = 0;
		for(int i =0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c=='j')
			{
				count = count +1;
			}
		}
		
		System.out.println(count);
		
		
	}

}
