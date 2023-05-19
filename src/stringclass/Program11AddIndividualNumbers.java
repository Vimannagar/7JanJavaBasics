package stringclass;

public class Program11AddIndividualNumbers {

	public static void main(String[] args) {

		String s = "ghg432g4h3gg4j3g3g4";

		String num = "";

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				num = num + ch;
				int value = Integer.parseInt(num);

				sum = sum + value;

				num = "";

			}
		}

		System.out.println(sum);

	}

}
