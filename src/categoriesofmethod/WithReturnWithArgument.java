package categoriesofmethod;

public class WithReturnWithArgument {
	
	
	public static String calc(int a, String b)
	{
		String d = a+b;
		
		return d;
	}
	
	
	
	public void finalOutput(String s)
	{
		String finalvalue = s+"State";
		
		System.out.println(finalvalue);
	}
	
	
	
	
	public static void main(String[] args) {
		
	String uidname	= calc(80, "John");
	
	String s = uidname+"california";
	
	System.out.println(s);//80JohnCalifornia
	
	System.out.println("************************************************");
	
	WithReturnWithArgument wrwa = new WithReturnWithArgument();
	
	wrwa.finalOutput(s);
		
		
	}

}
