package methods;

public class NonStaticMethod {
	
	
	public void areaCalulator()
	{
		int length = 50;
		
		int breadth = 10;
		
		int area = length*breadth;
		
		System.out.println("Area is "+area);
		
	}
	
	
	public static void main(String[] args) {
		
//		Creation of object
		
//		syntax - >  classname variablename = new Classname();
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		
		nsm.areaCalulator();
		
		
	}

}
