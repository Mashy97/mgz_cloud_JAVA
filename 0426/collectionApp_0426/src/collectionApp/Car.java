package collectionApp;
// �ڵ����� ������ Ŭ����
class Car {

	String name;
	String color;
	int direction;
	int speed;
	static String company;
	
	//Ŭ���� �ʱ�ȭ ���
	
	static {
		company = "";
	}
	//������ �޼ҵ�
	
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
