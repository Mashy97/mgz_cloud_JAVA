
public class Method02 {
	
public static void printAccount(Account temp) {
		System.out.printf("계좌 번호 : %s 잔고 : %d%n",temp.getAccountNum(),temp.getBalance());

} 

	public static void main(String[] args) {
		
		
		Account obj01 = new Account("1111","일길동","0000",1000);
		
		Account obj02 = new Account("2222","이길동","7777",2000);
		
		printAccount(obj01);
		printAccount(obj02);
	}
}
