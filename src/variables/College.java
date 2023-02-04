package variables;

public class College {
	
	
	String name = " ";
	
	int physicsmarks = 0;
	
	static String classyear =" ";
	
	
	public static void main(String[] args) {
		
		College s1 = new College();
		
		s1.name = "Daniel";
		s1.physicsmarks = 50;
		classyear = "Ist year";
		
		College s2 = new College();
		
		s2.name = "Eder";
		
		s2.physicsmarks = 60;
		
		
		System.out.println(s2.name +" : " + s2.physicsmarks);
		
	
		
		
		
	}

}
