package accessmodifiers;

public class AccessTestWithinPackage {
	
	
	public static void main(String[] args) {
		
		Test t = new Test(); // public class access
		
		Test2 t2 = new Test2();// default class access
		
//		Testing the different method level access modifiers
		
		Test4.m2();// public static method from Test4 class
		
		Test4 t4 = new Test4();
		t4.m1();
		
		Test4.m4();// default static method from Test4 class
		t4.m3();// default non static method from Test4 class
		
		
//		Test4.m6();// private static method cannot be accessible as it is private which can only be accessible within the class
//		
//		t4.m5();// private non static method cannot be accessible as it is private which can only be accessible within the class
		
		A a = new A();
		
		a.m9();
		
		A.m10();
		
		
//		Accessing variables:
		
		System.out.println(t4.a);//50- public variable so it can be accessible throughout the project
		
		System.out.println(Test4.s);// India - static default variable which can be accessible only within the package
		
//		System.out.println(t4.b);//b variable is private inside Test4 class hence it is not accessible here
		
		System.out.println(a.a);// can be accessible this protected variable inside the package same as default
		
		
		
	}

}
