
// 복권 프로그램
public class Homework_0425 {
	public static void main(String[] args) {
		int [] arr = new int [6];

		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("복권 번호 : ");
		for(int i =0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
		
	}
}
