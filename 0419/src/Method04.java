
public class Method04 {
	//�޼ҵ� ����
	public static Account createAccount(){
		Account account = new Account ("1111","�ϱ浿","0000",1000);
		return account;
	}
	
	public static void main(String[] args) {
		//���� ������ ȣ���Ͻÿ�
		Account temp = createAccount();
		System.out.printf("%s, %,d%n",temp.getAccountNum(),temp.getBalance());
		//�޼ҵ� ȣ��
		
	}
}
