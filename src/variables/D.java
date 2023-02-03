package variables;

public class D {
	
	
	int i = 50;
	
	static int j = 20;
	
	int k = 60;
	
	String s = "Daniel";
	
	
	
	public static void main(String[] args) {
				
		System.out.println(j);//20
		
		D d1 = new D();
		
		System.out.println(d1.i);//50
		
		System.out.println(d1.j);//20
		
		j = 60;
		
		System.out.println(j);//60
		
		d1.i = 30;
		
		System.out.println(d1.i);//30
		
		
		D d2 = new D();
		
		System.out.println(d2.i);//50
		
		System.out.println(d1.i);//30
		
		
		D d3 = new D();
		
		System.out.println(d3.i);//50
		
		d2.i = 80;
		
		System.out.println(d1.i);//30
		
		System.out.println(d2.i);//80
		
		System.out.println(d3.i);//50
		
		d1.i = 50;
		
		System.out.println(d1.i);//50
	
		
		System.out.println(d1.s);//Daniel
		
		d2.s = "Eder";
		
		System.out.println(d2.s);//Eder
		
		d3.s = "Ron";
		
		System.out.println(d3.s);//Ron
		
		
		System.out.println(d1.j);//60
		
		d1.j = 50;
		
		System.out.println(d1.j);//50
		
		System.out.println(d2.j);//50
		
		System.out.println(d3.j);//50
		
		System.out.println(j);//50
		
		
		
	}
	

}
