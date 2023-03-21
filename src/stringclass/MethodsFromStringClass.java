package stringclass;

public class MethodsFromStringClass {
	
	
	public static void main(String[] args) {
//		1. length()
		
		String s1 = "Pune";
		
		 int countofcharacters = s1.length();
		 
		 System.out.println(countofcharacters);//4
		
	//	2. charAt(int index)
			 
			 String s2 = "mumbai";
			 
			 char c = s2.charAt(3);
			 
			 System.out.println(c);//b
			 
			 
//	WAP to print the characters of String line by line
			 
//	WAP to print the reverse of a String	
			 
	
//	3. equals(String s): 
			 
			 String s3 = "abc";
			 
			 String s4 = "abc";
			 
			 boolean b = s3.equals(s4);
			 
			 System.out.println(b);//true
			 
//	4. equalsIgnoreCase(String s)
			 
			String s5 = "Pune";
			
			String s6 = "PUNe";
			
		boolean d	= s5.equalsIgnoreCase(s6);
		
		System.out.println(d);//true
		
//	5. toLowerCase():
		
		String s7 = "CheNNaI";
		
		String s8 = s7.toLowerCase();
		
		System.out.println(s8);//chennai
		
		
			 
			 
		 

		
		
	}
	
	

}
