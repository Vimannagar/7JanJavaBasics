package encapsulation;

public class ATMMachine {
	
	
	public static void main(String[] args) {
		BankServer bs = new BankServer();

		String output = bs.getBalance(6565);

		System.out.println(output);
	}

}
