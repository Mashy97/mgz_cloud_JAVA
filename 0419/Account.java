
class Account {

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
	
	public void getBalance() {
		System.out.printf("%s���� ������ �ܰ�� %d�� �Դϴ�.%n",this.name,this.balance);
	}
	
	// ��й�ȣ ����
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
}

