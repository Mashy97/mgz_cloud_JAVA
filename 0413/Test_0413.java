
public class Test_0413 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10;j++) {
				System.out.printf("%d * %d = %d	\t",j,i,j*i);
				if(j==9) {
					System.out.printf("%n");
				}
			}
		}
	}
}
