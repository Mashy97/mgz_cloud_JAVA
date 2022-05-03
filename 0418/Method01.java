
public class Method01 {
	//두개의 정수 합을 구하는 메소드 정의
	public static int add ( int num01, int num02) {
		return num01 + num02 ;	}
	
	public static void main(String[] args) {
		int result = add(5,10);
		System.out.printf("%d%n",result);
	}
}
	//인스턴스 메소드
//	public int add ( int num01, int num02) {
//		return num01 + num02 ;
//	}
//	
//	public static void main(String[] args) {
//			Method01 obj = new Method01();
//			int result = obj.add(5,10);
//			System.out.printf("%d%n",result);
//	}

