
public class Method04 {
	//메소드 정의
	public static Account createAccount(){
		Account account = new Account ("1111","일길동","0000",1000);
		return account;
	}
	
	public static void main(String[] args) {
		//계좌 정보를 호출하시오
		Account temp = createAccount();
		System.out.printf("%s, %,d%n",temp.getAccountNum(),temp.getBalance());
		//메소드 호출
		
	}
}
