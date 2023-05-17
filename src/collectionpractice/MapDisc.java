package collectionpractice;

import java.util.HashMap;

public class MapDisc {
	
	
	public static void main(String[] args) {
		HashMap<Integer, String>  hm = new HashMap<Integer, String> ();
		
		hm.put(12, "Pune");
		
		hm.put(43, "Borivali");
		
		hm.put(13, "Solapur");
		
		hm.put(14, "Chinchwad");
		
		hm.put(20, "Pune");
		
		hm.put(14, "Wakad");
		
		
		System.out.println(hm);
	}

}
