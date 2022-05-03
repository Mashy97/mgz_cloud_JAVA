
public class Method03 {
	//메소드 정의
	public static void printArray(int [] temp) {
		//내열 요소의 내용을 출력
		for(int i=0;i<5;i++) {
			System.out.printf("%d\t",temp[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int [] arr = {1,5,2,6,7};
		
		printArray(arr);
		//메소드 호출
	}
}
