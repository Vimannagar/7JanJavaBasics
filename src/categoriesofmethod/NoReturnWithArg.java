package categoriesofmethod;

public class NoReturnWithArg {
	
	public void m1(String s, int i, int j)
	{
		System.out.println(s);//velocity
		
		System.out.println(i);//56
		
		System.out.println(j);//78
	}
	
	public static void sum(int i, int j)
	{
		int k = i+j;
		
		System.out.println(k);
		
	}
	
	
	public static void main(String[] args) {
		
		NoReturnWithArg nrwa= new NoReturnWithArg();
		
		nrwa.m1("Velocity", 56, 78);
		
		nrwa.m1("Ron", 20, 15);
		
		
		sum(2,3);//5
		
		sum(120, 30);
		
	}
	
//	WAP to define the calculator which can perform any operation with multiple set of data
	

}
