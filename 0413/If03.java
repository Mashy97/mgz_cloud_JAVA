
public class If03 {
	public static void main(String[] args) {
		int num = 11;
		
	if (num > 0) {
		System.out.printf("%d는 양수입니다.",num);
	} 
	else if(num < 0){
		System.out.printf("%d는 음수입니다.",num);
	}
	else {
		System.out.printf("%d는 0입니다.",num);
	}
	
	}
}
