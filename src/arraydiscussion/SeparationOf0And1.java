package arraydiscussion;

import java.util.Arrays;

public class SeparationOf0And1 {
	
	public static void main(String[] args) {
		
		
		int a [] = {1, 0, 0, 1, 0, 1, 1};
		
		Arrays.sort(a);
		
		for(int f :a)
		{
			System.out.println(f);
		}
	}

}
