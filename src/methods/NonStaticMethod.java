package methods;

public class NonStaticMethod {
	
	
	public void areaCalulator()
	{
		int length = 50;
		
		int breadth = 10;
		
		int area = length*breadth;
		
		System.out.println("Area is "+area);
		
	}
	
	public void uniqueIDGenerator()
	{
		String name = "Daniel";
		
		String id = name+"01";
		
		System.out.println(id);
		
	}
	
	
	public static void main(String[] args) {
		
//		Creation of object
		
//		syntax - >  classname variablename = new Classname();
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		
		nsm.areaCalulator();
		
		nsm.areaCalulator();
		
		nsm.uniqueIDGenerator();
		
		NonStaticMethod obj1 = new NonStaticMethod();
		
		obj1.areaCalulator();
		
		obj1.uniqueIDGenerator();
		
		
		
		
	}

}
