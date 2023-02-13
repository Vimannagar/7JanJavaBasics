package categoriesofmethod;

public class FarmerLandCalculation {
	
	
	
	
	public int areaCalculator(int length, int breadth)
	{
		int area = length * breadth;

		return area;
	}
	
	
	public static void main(String[] args) {
		
		FarmerLandCalculation flc = new FarmerLandCalculation();
		
		int area1 = flc.areaCalculator(50, 30);
		
		int area2 = flc.areaCalculator(20, 60);
			
		int area3 = flc.areaCalculator(10, 80);
		
		
		int totalarea = area1 + area2 + area3;
		
		System.out.println("total area is :"+totalarea);
		
	}
	

}
