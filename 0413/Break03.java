
public class Break03 {
	public static void main(String[] args) {
		outer:
		for(int i=1;i<=3;i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) {
					break outer;
				}
				System.out.printf("i = %d, j = %d%n",i,j);
			}
		}
	}
}
