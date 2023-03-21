package stringclass;

public class ConceptOfString {
	
	
	public static void main(String[] args) {
//		Ways to define the string
		
		
		
		String s2 = new String("abc");
		
		String s3 = new String("def");
		
		
		String s4 = new String("abc");
		
		String s5 = new String("xyz");
		
		String s6 = "wxy";
		
		String s1 = "abc";
		
		String s7 = "abc";
		
		
//		to verify strings are pointing to the same object or not
		
		boolean ispointingsame = s1==s7;
		
		System.out.println(ispointingsame);
		
		boolean ispointingsame2 = s2==s1;
		
		System.out.println(ispointingsame2);
		
		
		boolean ispoint3 = s2 == s4;
		
		System.out.println(ispoint3);
		
		
		boolean iscontentsame = s2.equals(s4);
		
		System.out.println(iscontentsame);
		
		
		
		
		
	}

}
