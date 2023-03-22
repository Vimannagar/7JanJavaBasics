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
		
// 6. toUpperCase()
		
		String s9 = "Bangalore";
		
		String s10 = s9.toUpperCase();
		
		System.out.println(s10);//BANGALORE
		
//	7. subString(int index)
		
		String s11 = "Hyderabad";
		
		String s12 = s11.substring(2);
		
		System.out.println(s12);//derabad
		
// 8. subString(int begin, int end)
		
		String s13 = "Hamirpur";
		
		String s14 = s13.substring(1, 5);
		
		System.out.println(s14);//amir
		
		
//9. replace(char old, char new):
		
		
		String s15 = "abcdaf";
		
		String s16 = s15.replace('a', 'd');
		
		System.out.println(s16);//dbcddf
		
//10. replace(String old, String new)
		
		String s17 = "Punecity";
		
		String s18 = s17.replace("city", "mahanagar");
		
		System.out.println(s18);//Punemahanagar
			 
			 
//	Assignment: WAP to remove all the spaces from the String- this is String
		
		
//	11. trim()
		
		String s19 = "    this is      String         ";
		
		
		String s20 = s19.trim();
		
		System.out.println(s20);//this is      String
		
		
// 12. indexOf(char c)
		
		String s21 = "abcdcf";
		
		int index = s21.indexOf('c');
		
		System.out.println(index);//2
		
//	13. split(String s)
		
		String s22 = "This is String";
		
		String [] s23 = s22.split("i");
		
		for(String s24 :s23)
		{
			System.out.println(s24);
		}

//Assignment: WAP to reverse a String without reverse the individual word -"This is String";
		
//14. startsWith(String s)
		
		String s25 = "Denver";
		
		boolean s26 = s25.startsWith("Den");
		
		System.out.println(s26);//true
		
		
//	15. endsWith(String s)
		
		String s27 = "Ohio";
		
		boolean s28 = s27.endsWith("io");
		
		System.out.println(s28);//true
		
// Converting the primitive data type into non primitive data type
		
		int i = 80;
		
		String s29 = String.valueOf(i);
		
		System.out.println(s29+2);//802
		
		
		char t = 'p';
		
		String s30 = String.valueOf(t);
		
		System.out.println(s30);//p
		
		
		
		
	}
	
	

}
