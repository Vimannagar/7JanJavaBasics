package arraydiscussion;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		
		int a [] = {1, 2, 3, 5, 6};
					
		
		for(int i=0; i<a.length-1; i++)
		{
			boolean iscorrect = a[i]+1 == a[i+1];
			
			if(!(iscorrect))
			{
				System.out.println(a[i]+1);
			}
			
			
		}
		
		
	}

}
