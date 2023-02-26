package accesstest;

import accessmodifiers.Test;
import accessmodifiers.Test3;


public class AccessTest {
	
	
	public static void main(String[] args) {
		
		Test t = new Test();// public class access
		
//		Test2 t2 = new Test2();// cannot be accesssible as it is a default class which is to be access with in the same package only
		
		Test3 t3 = new Test3();// accessing public final class from accessmodifier package
		
		
		
	}

}
