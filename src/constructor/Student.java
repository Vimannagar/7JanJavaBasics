package constructor;

public class Student {
	
	String name;
	
	
	
	int physicsmarks;
	
	static String classyear;
	
	public Student(String name, int physicsmarks)
	{
		this.name = name;
		
		this.physicsmarks= physicsmarks;
		
	}
	
	
	public static void main(String[] args) {
		
		classyear = "firstyear";
		
		Student s1 = new Student("Cesar", 50);
		
		Student s2 = new Student("Diana", 90);
		
		
		System.out.println(s2.physicsmarks);
		
		
		
		
	}

}
