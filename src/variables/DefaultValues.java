package variables;

public class DefaultValues {
	
	// definition of variable
	static String s; 
	
	int i;
	
	static double d;
	
	char c;
	
	boolean b;
	
	public static void main(String[] args) {
		
		
		System.out.println(s);//null
		
		DefaultValues dv = new DefaultValues();
		
		
		System.out.println(dv.i);//0
		
		
		System.out.println(d);//0.0
		
		System.out.println(dv.c);// <space>
		
		System.out.println(dv.b);//false
	}
	
	

}
