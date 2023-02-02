package variables;

public class VariableTest {
	
	public static void main(String[] args) {
		
//		calling of static variable
		
		System.out.println(A.a);
		
		System.out.println(A.bol);
		
//		calling of non static variable
		
		B b = new B();
		
		System.out.println(b.s);//abc
		
		String e = b.s+"def";
		
		System.out.println(e);//abcdef
		
		
	}

}


// WAP to perform addition, substraction, multiplication and division 
//by defining only 3 variables inside the class
