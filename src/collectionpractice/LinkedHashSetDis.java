package collectionpractice;

import java.util.LinkedHashSet;

public class LinkedHashSetDis {
	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		
		
		lhs.add("Mumbai");
		lhs.add("Kolkata");
		lhs.add("Chennai");
		lhs.add("Agra");
		lhs.add("Delhi");
		lhs.add("Kanpur");
		lhs.add("Mumbai");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
	}

}
