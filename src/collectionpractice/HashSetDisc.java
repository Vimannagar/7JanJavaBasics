package collectionpractice;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDisc {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		
		
		hs.add("Mumbai");
		hs.add("Kolkata");
		hs.add("Chennai");
		hs.add("Agra");
		hs.add("Delhi");
		hs.add("Kanpur");
		hs.add("Mumbai");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
	}

}
