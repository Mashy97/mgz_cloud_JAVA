// 다양한 데이터 타입에 저장된 데이터 정보 출력 예제
public class Datatype07 {
	public static void main(String[] args) {
		String name = "송창현";
		int age = 26;
		String gender = "male";
		boolean isMarried = false;
		double height = 175.5;
		
		
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("성별 = "+gender);
		System.out.println("결혼 여부 = "+isMarried);
		System.out.println("키 = "+height);
		
		
		
//		 System.out.println("이름은 "+ name + ", 나이는 "+age);
		System.out.printf("이름은 %s, 나이는 %d, 성별은 %s, 결혼 여부는 %b, 키는 %.1f %n",name,age,gender,isMarried,height);
	}
}
