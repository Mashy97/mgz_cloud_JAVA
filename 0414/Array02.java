// 문자형 배열 - 일길동, 이길동, 삼길동 
public class Array02 {
	public static void main(String[] args) {
		String [] names = new String[3]; // 배열 선언
		
		names[0] = "일길동";	//배열 값 입력
		names[1] = "이길동"; 	
		names[2] = "삼길동";
		
		for(int i=0;i<3;i++)	//배열 값 출력
			System.out.printf("names[%s] : %s%n",i,names[i]);
		
		
	}
}
