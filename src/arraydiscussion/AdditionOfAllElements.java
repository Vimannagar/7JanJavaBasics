package arraydiscussion;

public class AdditionOfAllElements {
	
	
	public static void main(String[] args) {
		
		int a[][] = {{5, 6}, {1, 2}, {9, 8}	};
		
		int sum =0;
		
		System.out.println(a[0][1]);
		
		
		for(int i =0; i<a.length; i++)
		{
			for(int j=0;j<a[i].length; j++ )
			{
				sum = sum + a[i][j];
			}
		}
		
		System.out.println(sum);
		
	}
	
//	WAP to add all the elements present inside array

}
