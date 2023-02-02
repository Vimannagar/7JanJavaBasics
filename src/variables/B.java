package variables;

public class B {
	
//	non static variable
	
//	syntax: -   data_type variable_name = value; 
	
				String s = "abc";
				
				double d = 56.23;
								
				
				public static void main(String[] args) {
					
				B b = new B();
				
				System.out.println(b.s);//abc
				
				System.out.println(b.d);// 56.23
				
				B b1 = new B();
				
				System.out.println(b1.s);
				
					
				}

}
