package collectionpractice;

import java.util.TreeSet;

public class TreeSetDisc {
	
	public static void main(String[] args) {
		
TreeSet<String> ts = new TreeSet<String>(new MyComp());
		
		
		
		ts.add("Mumbai");
		ts.add("Kolkata");
		ts.add("Chennai");
		ts.add("Agra");
		ts.add("Delhi");
		ts.add("Kanpur");
		ts.add("Mumbai");
		
		System.out.println(ts);
	}

}
