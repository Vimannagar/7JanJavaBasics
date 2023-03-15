package interfacediscussion;

public  class Test implements Interface1
{


	public void m1() 
	{
		
		System.out.println("m1 method");
	}

	
	public void m2() {
		System.out.println("m2 method");
		
	}

	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.m1();
		
	}


	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void m10() {
		// TODO Auto-generated method stub
		
	}

	

}
