package collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String [] s = new String[5];
		
		s[0] = "one";
		s[1] = "two";
		s[2] = "three";
		s[3] = "four";
		s[4] = "five";
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);
		
		
	}

}
