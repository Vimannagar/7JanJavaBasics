	package accesstest;
	
	import accessmodifiers.A;
	
	public class B extends A{
		
		
		
		public static void main(String[] args) {
			
			A a = new A();
			
			B b = new B();
				
			b.m9();
			
			A.m10();// static method from A class which can be accessible only inside the child class for outside the package
			
			B.m10();// static method from A class which can be accessible only inside the child class for outside the package
			
			System.out.println(b.a);// non static protected variable accessing inside the child class using child class reference variable
			
			
			System.out.println(u);// protected static char variable can be accessible directly variable name / Classname.variable name
			
			
		}

}
