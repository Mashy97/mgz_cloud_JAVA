
public class Account {
	private String accountNum;
	private String name;
	private String pw;
	private int balance;

	Account(String accountNum, String name, String pw, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.pw = pw;
		this.balance = balance;
	}

	public void deposit (int x) {
		this.balance += x;
	}

	public void withdraw (int x) {
		this.balance -= x;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// 비밀번호 변경
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void transferAccount(Account temp01,Account temp02, int x) {
		temp01.balance -= x;
		temp02.balance += x;
	}
}
