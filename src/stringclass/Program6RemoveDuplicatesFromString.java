package stringclass;

import java.util.ArrayList;

public class Program6RemoveDuplicatesFromString {
	
	
	public static void main(String[] args) {
		
		String s = "askjdasdkjahkdaksj";
		
		char [] a = s.toCharArray();
		
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i=0; i<a.length; i++)
		{
		
		if(al.contains(a[i]))
		{
			
		}
		else
		{
			al.add(a[i]);
		}
		
		
		
		}
		
		System.out.println(al);
		
	}

}
