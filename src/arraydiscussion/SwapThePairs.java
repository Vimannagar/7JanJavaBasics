package arraydiscussion;

public class SwapThePairs {
	
	public static void main(String[] args) {
		
		int temp;
		int[] a = {1, 2, 60, 50, 89, 79};
		
//		output array = {2, 1, 50, 60, 79, 89}
		
		for(int i = 0; i<a.length; i++)
		{
			if(i%2==0)
			{
			temp = a[i];
			
			a[i] = a[i+1];
			
			a[i+1] = temp;
			}
		}
		
		for(int e:a)
		{
			System.out.print(e+" ");
		}
		
		
	}

}
