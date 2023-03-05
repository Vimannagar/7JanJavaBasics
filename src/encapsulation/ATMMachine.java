package encapsulation;

public class ATMMachine {
	
	
	public static void main(String[] args) {
		BankServer bs = new BankServer();

		String output = bs.getBalance(1234);// abstraction

		System.out.println(output);
		
		bs.setWithdrawlCash(1234, 5000);
	}

}
