
public class Method05 {
	public static void main(String[] args) {
		//�迭 ���� �� ����
		Account[] accounts = new Account[5];
		//�迭����� �� �Ҵ�
		accounts[0] = new Account("1111","�ϱ浿","0000",1000);
		accounts[1] = new Account("2222","�̱浿","0000",2000);
		accounts[2] = new Account("3333","��浿","0000",3000);
		accounts[3] = new Account("4444","��浿","0000",4000);
		accounts[4] = new Account("5555","���浿","0000",5000);
		//�迭����� �� ���  	for�� (���¹�ȣ, �ܰ�)
		for(int i = 0; i<accounts.length;i++) {
			System.out.printf("���¹�ȣ : %s, �ܰ� : %,d%n",accounts[i].getAccountNum(),accounts[i].getBalance());
		}
		//�迭����� �� ���		enhanced - for�� (���¹�ȣ, �ܰ�)
		for(Account temp: accounts) {
			System.out.printf("���¹�ȣ : %s, �ܰ� : %,d%n",temp.getAccountNum(),temp.getBalance());
		}
	}
}

/*
	1111 �ϱ浿 0000 1000
	2222 �̱浿 0000 2000
	3333 ��浿 0000 3000
	4444 ��浿 0000 4000
	5555 ���浿 0000 5000
*/