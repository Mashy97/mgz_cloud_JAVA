import java.util.Iterator;

//break 문에 대한 예제
public class Break01 {
	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.printf("i = %d%n",i);
		}
	}
}
