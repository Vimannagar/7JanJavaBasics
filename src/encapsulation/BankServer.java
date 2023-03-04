package encapsulation;

public class BankServer {

private	double cust1balance = 50000;

	public String getBalance(int pin) {
		String s = "";
		if (pin == 1234) {
			s = "your balance is " + cust1balance;
		}

		else {
			s = "please check the pin and try again";
		}

		return s;

	}

	public static void main(String[] args) {
		BankServer bs = new BankServer();

		String output = bs.getBalance(1234);

		System.out.println(output);
	}

}
