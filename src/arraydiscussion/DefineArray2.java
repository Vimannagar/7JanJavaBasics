package arraydiscussion;

public class DefineArray2 {
	
	
	public static void main(String[] args) {
		
//		syntax
//		data_type variablename[] = {value1, value2, value3};
		
		String s [] = {"Pune", "Delhi", "Mumbai", "Kolkata", "Chennai"};
		
		int size = s.length;
		
		System.out.println(size);//5
		
		for(int i=0; i<size; i++)
		{
			System.out.println(s[i]);
			
		}
		
	}

}
