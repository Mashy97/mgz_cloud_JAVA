package collectionApp;

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
		System.out.printf("계좌번호 : %s, 이름 : %s, 비밀빈호 : %s, 잔고 : %,d원%n", 
				accountNum, name, pw, balance);
	}
	

	public int compareTO(Account o) {
		return this.accountNum.compareTo(o.accountNum);
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", name=" + name + ", pw=" + pw + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return accountNum.hashCode()+name.hashCode()+pw.hashCode()+Integer.valueOf(balance).hashCode();
	}
	

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) {
			return false;
		}
		Account ac = (Account)obj;
			if(this.accountNum.equals(ac.accountNum)&&
			  this.name.equals(ac.name)&&
			  this.pw.equals(ac.pw)&&
			  this.balance == ac.balance){
				  return true;
			  }
			return false;
			
	}

}
	
	

