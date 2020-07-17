package quetion01;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		//super(); - 오브젝트 상속
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void info () {
		System.out.println(this.getAno()+
				"\t"+this.getOwner()+
				"\t"+this.getBalance());
	}
	
	@Override 
	public boolean equals(object obj) {
		if(obj instanceof String) {
			return this.ano.contentEquals((String)obj);{
			}
		}
	}

}
