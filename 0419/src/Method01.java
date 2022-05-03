public class Method01 {
	public static void main(String[] args) {
		//계좌 인스턴스 생성
		Account src = new Account("1111","일길동","1234",1000);
		
		Account temp = src;
		
		System.out.printf("src : %s, temp : %s%n",src,temp);
	}
}
