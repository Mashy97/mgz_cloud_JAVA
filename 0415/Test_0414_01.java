import java.util.Scanner;

public class Test_0414_01 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		int [][] arr = {{1,9,1,2,1,7,1,2,},
						{3,4,5,6},
						{7}};
		
		int a;
		int sum = 0 ;
		int result01; // sum을 11로 나눈 나머지 값
//		
//		arr[0] = new int [8];			
//		arr[1] = new int [4];
//		arr[2] = new int [1];
//		
//																				                                            
//		 for(int i=0; i<arr.length; i++) {
//	            for(int j=0; j<arr[i].length; j++) {
//	                arr[i][j] = scan.nextInt(); //스캔으로 주민번호 하나씩 입력 받기
//	            }
//	        }
//		
		for(int i=0; i<(arr.length-1);i++) {
			for(int j=0;j<(arr[i].length);j++) {
				int b = j+2;	
				a = arr[i][j] * b;
				sum += a;
			}
		}
		result01 = 11-(sum % 11);
		
		 if (result01 == 10) {
			 result01 = 11-(sum % 10);
		 }
		 
		if(result01==arr[2][0]) {
			System.out.println("정상적인 주민번호입니다.");
		}
		else {
			System.out.println("정상적인 주민번호가 아닙니다.");
		}
		
	
			if(arr[0][6] == 1 || arr[0][6] == 3) {
				System.out.println("남성입니다.");
			}
			else {
				System.out.println("여성입니다.");
			}
		
	}
}
//
//		a*2, b*3, c*4, d*5, e*6, f*7
//		[00] [01] [02] [03] [04] [05]	
//		g*8, h*9, i*2, j*3, k*4, l*5  
//		[10] [11] [12] [13] [14] [15]
//		
//
//		a*2, b*3, c*4, d*5
//		[00] [01] [02] [03]
//		e*6, f*7, g*8, h*9
//		[10] [11] [12] [13]
//		i*2, j*3, k*4, l*5  
//		[20] [21] [22] [23]
//
//
//		a*2, b*3, c*4, d*5, e*6, f*7, g*8, h*9
//		[00] [01] [02] [03] [04] [05] [06] [07]
//		i*2, j*3, k*4, l*5  
//		[10] [11] [12] [13]
//		 m	
//		[20]
//
//
//
//
