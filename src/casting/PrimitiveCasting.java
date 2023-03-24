package casting;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
//		syntax for conversion:
			
//			data_type variable= (data_type)variable_to_convert;
		
		
//		implicit casting
		
		byte b = 50;
		
		int i = (int)b;
		
		System.out.println(i);//50
		
		
		int i1 = 80;
		
		long l1 = (long)i1;
		
		System.out.println(l1);
		
		
		
//		explicit casting
		
		
		int i2 = 100;
		
		byte b2 = (byte)i2;
		
		System.out.println(b2);//100
		
		System.out.println(i2);
		
		int i3 = 129;
		
		byte b3 = (byte)i3;
		
		System.out.println(b3);//-127
		
		
	}

}
