package variables;

public class A {
	
//	Here we are discussing static variable
	
//	syntax of static variable
	
//	static data_type variable_name = value;
	
	static int a = 50;
	
	static boolean bol = true;
	
	static String s = "Velocity";
	
	
	public static void main(String[] args) {
		
		System.out.println(a);//50
		
		int u = a+5;
		
		System.out.println(u);//55
		
		System.out.println(A.a);//50
		
		System.out.println(a+s);//50Velocity
		
		a = u;
		
		System.out.println(a);//55
		
	}
	
	
	

}
