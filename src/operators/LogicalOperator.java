package operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		
		int a = 50;
		
		int b = 60;
		
//	Logical AND Operator
		
	boolean c	= a>50 && b==60;
	
	System.out.println(c);// false
	
	
	boolean d = b==60 && a==50;
		
	System.out.println(d);//true
	
//	Logical OR Operator
	
	boolean e = a>50 || b==60;
	
	System.out.println(e);//true
	
//	Logical NOT Operator
	
	boolean f = false;
	
	boolean g = !f;
	
	System.out.println(g);//true
	
	
	boolean h = a!=60;
	
	System.out.println(h);//true
	
	
	
	boolean i = !(b==60);
	
	System.out.println(i);//false
	
//	Assignment
//	1. WAP to check the number is even or odd
	
//	2. Ranges :
//	int a = 60;
//		
//	0 to 20 --> number is between 0 and 20.
//	
//	21 to 40 --> number is between 21 and 40.
//	
//	41 to 60 --> number is between 41 and 60.
//	
//	61 to 80 --> number is between 61 and 80.
//	
//	beyond 80 --> number is out of range.
		
//	3. WAP to check whether the given dimensions are representing square or not
//	a= 50, b=60, c= 60, d = 60
	
	
	
		
	}

}
