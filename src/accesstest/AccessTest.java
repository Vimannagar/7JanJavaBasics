package accesstest;

import accessmodifiers.A;
import accessmodifiers.Test;
//import accessmodifiers.Test3;
import accessmodifiers.Test4;


public class AccessTest  {
	
	
	public static void main(String[] args) {
		
		Test t = new Test();// public class access
		
//		Test2 t2 = new Test2();// cannot be accesssible as it is a default class which is to be access with in the same package only
		
//		Test3 t3 = new Test3();// accessing default final class from accessmodifier package as it is default hence we will not be able to access it here(outside the package)
		
		
		Test4.m2();// public static method from Test4 class
		
		Test4 t4 = new Test4();
		t4.m1(); // // public non static method from Test4 class
		
		
//		Test4.m4();// as default is applicable for within in the package hence it is not valid
//		t4.m3();// as default is applicable for within in the package hence it is not valid

		
//		Test4.m6();// private static method cannot be accessible as it is private which can only be accessible within the class
//		
//		t4.m5();// private non static method cannot be accessible as it is private which can only be accessible within the class

//		Accessing the variables 
		
		System.out.println(t4.a);//50- public variable so it can be accessible throughout the project
		
		
//		System.out.println(Test4.s);// It is not accessible here as variable is default
		

		
}
}
