package abstractmodifier;

public  class  Test2 extends Test {


	public void sendMoneyFromAccountToWallet() {
		
		System.out.println("This is logic for Send money from account to wallet");
	}


	public void receiveMoneyFromAccountToWallet() {
		
		System.out.println("this is logic for receive money account to wallet");
		
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		t2.sendMoneyFromAccount();
		t2.sendMoneyFromAccountToWallet();
		t2.receiveMoneyFromAccount();
		t2.receiveMoneyFromAccountToWallet();
		
	}


	

	

}
