package abstractmodifier;

public abstract class Test {
	
	
	public void sendMoneyFromAccount()
	{
		System.out.println("logic for send money from account");
	}
	
	public void receiveMoneyFromAccount()
	{
		System.out.println("logic for receive money from account");
	}
	
	public abstract void sendMoneyFromAccountToWallet();
	
	
	public abstract void receiveMoneyFromAccountToWallet();
	
	
	

}
