package Bank;

public class Account {
	private long balance;
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	//잔액 조회
	public void checkBalance() {
		System.out.println("현재 잔액 : "+this.balance);
	}
	//입금
	public void deposit(int money) {
		this.balance += money;//형변환
		System.out.println("입금 완료");
	}
	//출금
	public void withdraw(int money) throws ExmpleException {
		if((long)money>this.balance) {
			throw new ExmpleException("11");
		} else{
			this.balance -= money;
			System.out.println("출금 완료");
		}
	}

}
