
public class RandomTest02 {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			int ran = (int)(Math.random()*41+5); // 5 ~ 45 ������ ������ ����
			System.out.println(ran);
		}
	}
}
