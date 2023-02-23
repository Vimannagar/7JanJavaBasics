package inheritance;

public class Parent extends GrandParent
{
	
	
	public void home()
	{
		System.out.println("Home method from parent class");
	}
	

	public void furniture()
	{
		System.out.println("furniture method from parent class");
	}
	
	public void car()
	{
		System.out.println("car method from parent class");
	}
	
	public static void surname()
	{
		System.out.println("surname method from parent class");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();
		
		Parent p = new Parent();
		
		p.farm();
		
		
	}

}
