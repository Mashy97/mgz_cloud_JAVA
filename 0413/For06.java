
public class For06 {
	public static void main(String[] args) {
		for(int i=2;i<=5;i++) {
			System.out.printf("== %d�� ==%n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d%n",i,j,i*j);
			}
		}
	}
}
