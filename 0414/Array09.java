
public class Array09 {
	public static void main(String[] args) {
		int [][] arr = new int [4][];
		arr[0] = new int [] {100,100};
		arr[1] = new int []	{90,90,90};
		arr[2] = new int [] {80,80,80};
		arr[3] = new int [] {70,70,70,70};
		
		
		for(int[] temp01: arr) {
			for(int temp02: temp01) {
				System.out.printf("%d%n",temp02);
			}
			System.out.println();
		}
	}
}
