package constructor;

public class C {

	public C() 
	{
		this("Pune");
		System.out.println("Zero argument constructor");

	}

	public C(String s)
	{
		this(89.56, false);
		System.out.println("one argument constructor");
	}

	public C(double d, boolean f) 
	{
		System.out.println("two argument constructor");
	}

	public static void main(String[] args) {

		C c = new C();

	}

}
