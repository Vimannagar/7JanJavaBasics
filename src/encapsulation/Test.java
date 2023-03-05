package encapsulation;

public class Test {

	String name;
	
	public String getName()// getter method
	{
		return name;
	}
	
	public void setName(String name)// setter method
	{
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.setName("David");
		
		String n = t.getName();
		
		System.out.println(n);//David
	}
	
	
}
