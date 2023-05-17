package collectionpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsInHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Character>  hm = new HashMap<String, Character> ();
		
		hm.put("abc", 'a');
		
		hm.put("def", 'd');
		
		hm.put("xyz", 'x');
		
		hm.put("wxy", 'w');
		
		hm.put("ghi", 'g');
		
		
		System.out.println(hm);//{abc=a, def=d, xyz=x, wxy=w, ghi=g}
		
		
		Set<String> keys = hm.keySet();
		
		System.out.println(keys);//[abc, def, xyz, wxy, ghi]
		
		
		
		Collection<Character> value = hm.values();
		
		System.out.println(value);//[a, d, x, w, g]
		
		
		boolean iskeypresent = hm.containsKey("ghi");
		
		
		System.out.println(iskeypresent);//true
		
		boolean isvaluepresent = hm.containsValue('a');
		
		System.out.println(isvaluepresent);//true
		
		
		
		Character valuereturned = hm.get("def");
		
		
		System.out.println(valuereturned);// d
		
		
	Set<Entry<String, Character>> keyvalue = hm.entrySet();
	
	for(Entry<String, Character> kv :keyvalue)
		
	{			
		String key = kv.getKey();
		
		Character valuee = kv.getValue();
		
		System.out.println(key);
		System.out.println(valuee);
	
	}
	
	
	}

}
