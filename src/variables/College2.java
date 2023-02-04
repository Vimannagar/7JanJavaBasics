package variables;

public class College2 {
	
	
	String name = " ";
	
	 int physicsmarks = 0;
	
	static String classyear =" ";
	
	
	public static void main(String[] args) {
		
		College2 s1 = new College2();
		
		s1.name = "Daniel";
		s1.physicsmarks = 50;
		classyear = "Ist year";
		
		College2 s2 = new College2();
		
		s2.name = "Eder";
		
		s2.physicsmarks = 60;
		
		
		System.out.println(s2.name +" : " + s2.physicsmarks);
		
		System.out.println(s1.physicsmarks);
		
	
		
		
		
	}

}
