package arrayApp;

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
	
	// ��й�ȣ ����
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}
	
	public void transferAccount(Account temp01,Account temp02, int x) {
		temp01.balance -= x;
		temp02.balance += x;
	}
	public void printAccount() {
		System.out.printf("���¹�ȣ : %s, �̸� : %s, ��к�ȣ : %s, �ܰ� : %,d��%n", 
				accountNum, name, pw, balance);
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", name=" + name + ", pw=" + pw + ", balance=" + balance + "]";
	}

	
}
