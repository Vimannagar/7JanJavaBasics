package stringclass;

public class ReverseOfString {
	
	public static void main(String[] args) {
		String rev = "";
		
		String s = "Mumbai";
		
		int size = s.length();
		
		for(int i=size-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			
			rev= rev + ch;
			
	
		}
		
		System.out.println(rev);
	}

}
