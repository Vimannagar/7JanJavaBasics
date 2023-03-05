package encapsulation;

public class BankServer {

private	double cust1balance = 50000;



	public String getBalance(int pin) {//Getter method
		String s = "";
		if (pin == 1234) {
			s = "your balance is " + cust1balance;
		}

		else {
			s = "please check the pin and try again";
		}

		return s;

	}
	
	public void setWithdrawlCash(int pin, double amount)//Setter method
	{
		if(pin == 1234)
		{
		if(amount <= cust1balance)
		{
			cust1balance = cust1balance - amount;
			
			System.out.println("Please collect the cash and your balance is "+cust1balance);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		}
		else
		{
			System.out.println("Incorrect pin");
		}
		
		
	}

	public static void main(String[] args) {
		BankServer bs = new BankServer();

		String output = bs.getBalance(1234);

		System.out.println(output);
	}

}
