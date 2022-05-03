
public class CarApp {
	public static void main(String[] args) {
		
		// 자동차 제조회사를 조회하여 출력하시오.
		String company = Car.getCompany();
		System.out.printf("제조회사 :%s%n",Car.company);
		
		
		Car car01 = new Car("제네시스", "블랙",2,100);
		Car car02 = new Car("소나타", "화이트",1,60);
	}
}
