public class Method01 {
	public static void main(String[] args) {
		//���� �ν��Ͻ� ����
		Account src = new Account("1111","�ϱ浿","1234",1000);
		
		Account temp = src;
		
		System.out.printf("src : %s, temp : %s%n",src,temp);
	}
}
