package collectionpractice;

import java.util.ArrayList;

public class ConversionOfArrayListIntoArray {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(80);
		
		al.add(90);
		
		al.add(12);
		
		al.add(15);
		
		al.add(8);
		
		Integer [] a = new Integer [al.size()];
		
		al.toArray(a);// copy the content into Array from ArrayList
		
		for(int aa:a)
		{
			System.out.println(aa);
		}
		
		
		
	}

}
