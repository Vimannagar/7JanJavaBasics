package arraydiscussion;

public class DefineArray {
	

	
	public static void main(String[] args) {
//		first way to define the array:
		
		
//		syntax:
//		datatype [] referencevariablename = new datatype[size_of_array];
		
		
		int a [] = new int[6];
		
		a[0] = 80;
		
		a[1] = 70;
		
		a[2] = 45;
		
		a[4] = 10;
		
		a[3] = 6;
		
		a[5] = 12;
		
		System.out.println(a[2]);//45
		
		
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
		
		int sizeofarray = a.length;
		
		System.out.println("Size of array is" + sizeofarray);
		
		
		
		for(int i = 0; i<sizeofarray; i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	

}
