package collectionpractice;

import java.util.ArrayList;

public class ListClasses {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
				
		al.add("Pune");
		
		al.add("Mumbai");
		
		al.add("Madras");
		
		al.add("Delhi");
		
		al.add("Kolkata");
	
	
		
		System.out.println(al);//[Pune, Mumbai, Madras, Delhi, Kolkata]
		
		
		al.remove(0);
		
		System.out.println(al);//[Mumbai, Madras, Delhi, Kolkata]

		al.set(2, "Gurgaon");
		
		System.out.println(al);//[Mumbai, Madras, Gurgaon, Kolkata]

		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Sangli");
		al2.add("Baramati");
		al2.add("Satara");
		
		al2.addAll(al);
		
		System.out.println(al2);//[Sangli, Baramati, Satara, Mumbai, Madras, Gurgaon, Kolkata]
		
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.add("Anand");
		al3.add("Ahemdabad");
		al3.add("Rajkot");
		
		
		al3.addAll(al2);
		
		System.out.println(al3);///[Anand, Ahemdabad, Rajkot, Sangli, Baramati, Satara, Mumbai, Madras, Gurgaon, Kolkata]

		al3.removeAll(al);
		
		System.out.println(al3);//[Anand, Ahemdabad, Rajkot, Sangli, Baramati, Satara]
		
		
		al3.retainAll(al2);
		
		System.out.println(al3);//[Sangli, Baramati, Satara]
		
		boolean ispresent = al3.contains("Sangli");
		
		System.out.println(ispresent);//true
	
		
		al3.add("Satara");
		
		System.out.println(al3);
		
		String value = al3.get(1);
		
		System.out.println(value);
		
		
			
	
	}
	
	

}
