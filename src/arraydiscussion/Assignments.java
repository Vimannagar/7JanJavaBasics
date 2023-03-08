package arraydiscussion;

public class Assignments {
	
	
	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 8, 5};
		
		int sum = 0;
		
		
		for(int i=0; i<a.length; i++)
		{
			if(!(i%2 ==0))
			{
				sum = sum + a[i];
			}
			
		}
		
		System.out.println(sum);
		
		
				
		}
		
		
		
	

}
