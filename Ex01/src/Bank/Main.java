package Bank;
;
public class Main {
	static Account acc = new Account();
	public static void main(String[] args) {
		 	
		acc.deposit(10000);
		acc.checkBalance();
		
		try {
		acc.withdraw(5000);
		} catch (ExmpleException e) {
			
			
		}
		acc.checkBalance();
		try {
		acc.withdraw(10000);
		} catch(ExmpleException e) {}
		acc.checkBalance();

	}

}
