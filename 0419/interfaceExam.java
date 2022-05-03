//super interface
interface Volume{
	//�߻�޼ҵ�
	void turnUp(int volume);
	void turnDown(int volume);
	void turnOn(int volume);
	void turnOff(int volume);
}





//sub interface
interface AdvancedVolume extends Volume{
	//�߻� �޼ҵ�
	private int volume;

	@Override
	default void turnUp(int volume) {
		// TODO Auto-generated method stub
		
	}
	@Override
	default void turnDown(int volume) {
		// TODO Auto-generated method stub
		
	}
		
}

class TV implements AdvancedVolume{
	
	private int volume;
	
	TV(){
		super();
	}
	
	public TV(int volume) {
		this.volume = volume;
	}

	@Override
	public void turnOn(int volume) {
		System.out.println("TV �Ҹ��� �Ѽ���.");
		this.volume = volume;
		
	}

	@Override
	public void turnOff(int volume) {
		System.out.println("TV �Ҹ��� ������.");
		this.volume = volume;
		
	}

	@Override
	public void turnUp(int volume) {
		System.out.println("TV �Ҹ��� �ø�����.");
		this.volume += volume;
		
	}

	@Override
	public void turnDown(int volume) {
		System.out.println("TV �Ҹ��� ��������.");
		this.volume -= volume;
		
	}

	
	
 }
class Radio implements AdvancedVolume{
	 private int volume;
	 	
	@Override
	public void turnOn(int volume) {
		// TODO Auto-generated method stub
		System.out.println("TV �Ҹ��� �Ѽ���.");
		this.volume = volume;
	}
	@Override
	public void turnOff(int volume) {
		// TODO Auto-generated method stub
		System.out.println("TV �Ҹ��� ������.");
		this.volume = volume;
	}

	
	Radio(){
		 super();
	 }
	public Radio(int volume){
		this.volume = volume;
	}
	@Override
	public void turnUp(int volume) {
		System.out.println("���� �Ҹ��� ��������");
		this.volume += volume;
	}

	@Override
	public void turnDown(int volume) {
		System.out.println("���� �Ҹ��� ���߼���");
		this.volume -= volume;
	}
	
}

public class interfaceExam {
	public static void main(String[] args) {
		TV obj = new TV(60);
		obj.turnDown(10);
		obj.turnUp(20);
		Radio obj01 = new Radio(60);
		obj01.turnDown(10);
		obj01.turnUp(20);
	}
}
