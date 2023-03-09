package accessmodifiers;

public class FinalWithVariable {
	
	final int a = 60;
	
	public static final boolean b = false;
	
	
	public static void main(String[] args) {
		
		FinalWithVariable fwv = new FinalWithVariable();
		
		System.out.println(fwv.a);
		
//		fwv.a = 70; this is not valid as we have declared the variable as final hence it cannot be reinitialize
		
//		b= true;// error as b is final hence we cannot reinitialize it we just can use it 
		
		
		
		
		
		
	}
	
	

}
