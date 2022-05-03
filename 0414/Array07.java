
public class Array07 {
	public static void main(String[] args) {
		int scores[][] = {	{100,100,100,100,100},
							{90,90,90,90,90},
							{80,80,80,80,80},	};
		
		for(int[] temp01: scores) {
			for(int temp02: temp01) {
				System.out.printf("%d\t",temp02);
			}
			System.out.println();
		}
	}
}
