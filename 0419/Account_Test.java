
public class Account_Test {
	
	
	public static void main(String[] args) {
		
	Account ac01 = new Account("1111","�ϱ浿","1234",1000);
	Account ac02 = new Account("2222","�̱浿","5678",2000);
	
	ac01.getBalance();
	ac02.getBalance();
	// 1.
	
	
	
	
	// 3. ���¹�ȣ�� 1111�� ���� ���·� 5000���� �Ա��Ͻÿ�.
	ac01.deposit(5000);
	
	// 4. ���¹�ȣ�� 1111�� ���� ���¿� �ܰ��� ��ȸ�Ͽ� ����Ͻÿ�.
	ac01.getBalance();
	
	// 5. ���¹�ȣ�� 2222�� ���� ���¿��� 1000���� ����Ͻÿ�.
	ac02.withdraw(1000);
	
	// 6. ���¹�ȣ�� 2222�� ���� ���¿� �ܰ��� ��ȸ�Ͽ� ����Ͻÿ�.
	ac02.getBalance();
	
	// 7. ���¹�ȣ�� 1111�� ���� ������ ��й�ȣ�� 0000���� ����
	ac01.setPw("0000");
	
	// 8. ���¹�ȣ�� 1111�� ���� ������ ��й�ȣ�� ����Ͻÿ�.

	
	}
}