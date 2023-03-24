package stringclass;

public class MethodsFromStringClass {

	public static void main(String[] args) {
//		1. length()

		String s1 = "Pune";

		int countofcharacters = s1.length();

		System.out.println(countofcharacters);// 4

		// 2. charAt(int index)

		String s2 = "mumbai";

		char c = s2.charAt(3);

		System.out.println(c);// b

//	WAP to print the characters of String line by line

//	WAP to print the reverse of a String	

//	3. equals(String s): 

		String s3 = "abc";

		String s4 = "abc";

		boolean b = s3.equals(s4);

		System.out.println(b);// true

//	4. equalsIgnoreCase(String s)

		String s5 = "Pune";

		String s6 = "PUNe";

		boolean d = s5.equalsIgnoreCase(s6);

		System.out.println(d);// true

//	5. toLowerCase():

		String s7 = "CheNNaI";

		String s8 = s7.toLowerCase();

		System.out.println(s8);// chennai

// 6. toUpperCase()

		String s9 = "Bangalore";

		String s10 = s9.toUpperCase();

		System.out.println(s10);// BANGALORE

//	7. subString(int index)

		String s11 = "Hyderabad";

		String s12 = s11.substring(2);

		System.out.println(s12);// derabad

// 8. subString(int begin, int end)

		String s13 = "Hamirpur";

		String s14 = s13.substring(1, 5);

		System.out.println(s14);// amir

//9. replace(char old, char new):

		String s15 = "abcdaf";

		String s16 = s15.replace('a', 'd');

		System.out.println(s16);// dbcddf

//10. replace(String old, String new)

		String s17 = "Punecity";

		String s18 = s17.replace("city", "mahanagar");

		System.out.println(s18);// Punemahanagar

		System.out.println("*********************************************");

//	Assignment: WAP to remove all the spaces from the String- this is String

		String s31 = "this is String";

		String s32 = s31.replace(" ", "");

		System.out.println(s32);

		System.out.println("*******************************************************");

//	11. trim()

		String s19 = "    this is      String         ";

		String s20 = s19.trim();

		System.out.println(s20);// this is String

// 12. indexOf(char c)

		String s21 = "abcdcf";

		int index = s21.indexOf('c');

		System.out.println(index);// 2

//	13. split(String s)

		String s22 = "This is String";

		String[] s23 = s22.split("i");

		for (String s24 : s23) {
			System.out.println(s24);
		}
		System.out.println("**************************************");
//Assignment: WAP to reverse a String without reverse the individual word -"This is String";

		String s33 = "This is String";

		String[] s34 = s33.split(" ");

		for (int i = s34.length - 1; i >= 0; i--) {
			System.out.print(s34[i] + " ");
		}

		System.out.println("**************************************");

//14. startsWith(String s)

		String s25 = "Denver";

		boolean s26 = s25.startsWith("Den");

		System.out.println(s26);// true

//	15. endsWith(String s)

		String s27 = "Ohio";

		boolean s28 = s27.endsWith("io");

		System.out.println(s28);// true

// Converting the primitive data type into non primitive data type

		int i = 80;

		String s29 = String.valueOf(i);

		System.out.println(s29 + 2);// 802

		char t = 'p';

		String s30 = String.valueOf(t);

		System.out.println(s30);// p

//	Converting non primitive to primitive data type

		String s35 = "10";

		int s36 = Integer.parseInt(s35);
		System.out.println(s36 + 2);// 12

		String s37 = "56.23";

		double s38 = Double.parseDouble(s37);

		System.out.println(s38);// 56.23

//	String s39 = "ten";
//	
//	int s40 = Integer.parseInt(s39);
//	
//	System.out.println(s40);// Exception - NumberFormatException as the given format is not int type

//	16 toCharArray()

		String s41 = "Pennsylvania";

		char[] s42 = s41.toCharArray();

		for (int z = 0; z < s42.length; z++) {
			System.out.println(s42[z]);
		}

//	17 isAlphabetic()

		char s43 = 'a';

		boolean isalphabet = Character.isAlphabetic(s43);

		System.out.println(isalphabet);// true

//	18. isDigit()

		char s44 = '7';

		boolean isnumber = Character.isDigit(s44);

		System.out.println(isnumber);// true

//WAP to remove all the digits from the String- "He2l3l63o".

//WAP to remove all alphabet from the String- "He2l3l63o".	

//	Regular expression:

// 19. replaceAll(String regex)

		String s45 = "Spring";

		String s46 = s45.replaceAll("[A-Z]", "a");

		System.out.println(s46);// apring

		String s47 = s45.replaceAll("[A-D]", "a");

		System.out.println(s47);// Spring

		String s48 = "Houston";

		String s49 = s48.replaceAll("[a-z]", "q");

		System.out.println(s49);// Hqqqqqq

		String s50 = "Spring";

		String s51 = s50.replaceAll("[A-Za-k]", "!");

		System.out.println(s51);// !pr!n!

		String s52 = "ta!m1p4a";

		String s53 = s52.replaceAll("[^a-z]", "");

		System.out.println(s53);// tampa

		String s54 = "A2c4ce!ntu$re7";

		String s55 = s54.replaceAll("[^A-Za-z]", "");

		System.out.println(s55);// Accenture

		String s56 = s54.replaceAll("[^A-Za-z0-9]", "");

		System.out.println(s56);// !$

//WAP to remove the extra spaces from the String - "This    is         String"	
		
	}

}
