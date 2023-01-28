package methods;

public class Test {
	
	public static void main(String[] args) {
		
//Calling of static method from Calculator class		
		
		Calculator.multiplication();
		
		Calculator.addition();
		
//Calling of static method from Static method class
		
		StaticMethod.printHello();
		
//		Calling of non static method from Non static class
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		nsm.areaCalulator();
		
		nsm.uniqueIDGenerator();
		
		
		
	}

}
