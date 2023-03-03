package polymorphism;

public class ChildVar extends ParentVar
{

	
	String city = "Mumbai";
	
	
	
	
	public static void main(String[] args) {
		
		ChildVar cv = new ChildVar();
		
		System.out.println(cv.city);// mumbai
		
		ParentVar pv = new ParentVar();
		
		System.out.println(pv.city);// pune
		
		ParentVar pv1 = new ChildVar();
		
		System.out.println(pv1.city);//Pune 
		
		
	}
	
	
}
