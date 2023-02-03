package variables;

public class C {

//	difference between static variable and non static variable

//	WAP to calculate the area of a land using only non static variable

	int length = 50;

	int breadth = 10;

	public static void main(String[] args) {

		C c = new C();

		int area = c.length * c.breadth;

		System.out.println(area);

	}

}
