
public class Method02 {
	
public static void printAccount(Account temp) {
		System.out.printf("���� ��ȣ : %s �ܰ� : %d%n",temp.getAccountNum(),temp.getBalance());

} 

	public static void main(String[] args) {
		
		
		Account obj01 = new Account("1111","�ϱ浿","0000",1000);
		
		Account obj02 = new Account("2222","�̱浿","7777",2000);
		
		printAccount(obj01);
		printAccount(obj02);
	}
}
