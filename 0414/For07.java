
public class For07 {
	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0; j<=4;j++) {
				if(i==j) {
					System.out.printf("*");
				} 
				else if (i+j==4) {
					System.out.printf("*");
				}
				System.out.printf(" ");
			}	
			System.out.println("");
		}
	}
}