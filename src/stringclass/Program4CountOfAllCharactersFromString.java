package stringclass;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Program4CountOfAllCharactersFromString {
	
	public static void main(String[] args) {
		String s = "hhshkjshdkshdsjkdsa";
		
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
			
		}
		
		System.out.println(hm);
		
//		finding those characters which repeats themselves atleast 3 times
		
		Set<Entry<Character, Integer>> kv = hm.entrySet();
		
		for(Entry<Character, Integer> keyvalue:kv)
			
		{
			
			Character key = keyvalue.getKey();
			
			Integer value = keyvalue.getValue();
			
			
			if(value>=3)
			{
				System.out.println(key);
			}
		}
		
		
	}

}
