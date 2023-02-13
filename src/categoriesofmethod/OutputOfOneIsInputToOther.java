package categoriesofmethod;

public class OutputOfOneIsInputToOther {
	
	
	public static int m1()
	{
		int a =5+3;
		
		return a;
	}
	
	public void m2(int b)
	{
		int c= b+2;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		int y	=	m1();

		OutputOfOneIsInputToOther refvar = new OutputOfOneIsInputToOther();
		
		refvar.m2(y);
		
	}

}
