package stringclass;

public class ImmutableCheck {
	
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		s.concat("Software");
		
		System.out.println(s);//abc// immutable
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		sb.append("Software");
		
		System.out.println(sb);//abcSoftware// mutable
		
		
		
		
		
	}

}
