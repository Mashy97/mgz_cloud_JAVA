package collectionApp;
// 자동차를 구현한 클래스
class Car {

	String name;
	String color;
	int direction;
	int speed;
	static String company;
	
	//클래스 초기화 블록
	
	static {
		company = "";
	}
	//생성자 메소드
	
	Car(String name,String color, int direction, int speed)
	{	
	this.name = name;
	this.color = color;
	this.direction = direction;
	this.speed = speed;
}

	public void accelerate(int speed) {
		this.speed += speed;
	}
	
	public void decelerate(int speed) {
		this.speed -= speed;
	}
	
	public static String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", direction=" + direction + ", speed=" + speed + "]";
	}
	
}
