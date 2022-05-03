
public class Account_Test {
	
	
	public static void main(String[] args) {
		
	Account ac01 = new Account("1111","일길동","1234",1000);
	Account ac02 = new Account("2222","이길동","5678",2000);
	
	ac01.getBalance();
	ac02.getBalance();
	// 1.
	
	
	
	
	// 3. 계좌번호가 1111인 고객 계좌로 5000원을 입금하시오.
	ac01.deposit(5000);
	
	// 4. 계좌번호가 1111인 고객 계좌에 잔고를 조회하여 출력하시오.
	ac01.getBalance();
	
	// 5. 계좌번호가 2222인 고객 계좌에서 1000원을 출금하시오.
	ac02.withdraw(1000);
	
	// 6. 계좌번호가 2222인 고객 계좌에 잔고를 조회하여 출력하시오.
	ac02.getBalance();
	
	// 7. 계좌번호가 1111인 고객 계좌의 비밀번호를 0000으로 변경
	ac01.setPw("0000");
	
	// 8. 계좌번호가 1111인 고객 계좌의 비밀번호를 출력하시오.

	
	}
}
