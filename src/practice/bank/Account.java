package bank;

public class Account {
	// 필드
	private String accountNum;
	private String name;
	private int balance;
	// 생성자
	public Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	// toString
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + "]";
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
