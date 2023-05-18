package collectionpractice;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
	
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(12, "Pune");
		
		lhm.put(43, "Borivali");
		
		lhm.put(13, "Solapur");
		
		lhm.put(14, "Chinchwad");
		
		lhm.put(20, "Pune");
		
		lhm.put(14, "Wakad");
		
		
		System.out.println(lhm);
		
		
		
	}

}
