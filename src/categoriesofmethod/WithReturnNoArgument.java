package categoriesofmethod;

public class WithReturnNoArgument {
	
	
	
	public static int m1()
	{
		int i = 10;
		int j = 20;
		int k = i+j;
		
		System.out.println(k);
		
		return k;
	}
	
	
	public static String m2()
	{
		int roll = 20;
		
		String studentid = "COEP"+roll;
		
		return studentid;
	}
	
	public static void main(String[] args) {
		int f = m1();
		
		int k= f+2;
		
		System.out.println(k);//102
		
		
		String s = m2();
		
		
		System.out.println(s);
	}

}
