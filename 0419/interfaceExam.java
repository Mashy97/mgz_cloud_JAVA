//super interface
interface Volume{
	//추상메소드
	void turnUp(int volume);
	void turnDown(int volume);
	void turnOn(int volume);
	void turnOff(int volume);
}





//sub interface
interface AdvancedVolume extends Volume{
	//추상 메소드
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
		System.out.println("TV 소리를 켜세요.");
		this.volume = volume;
		
	}

	@Override
	public void turnOff(int volume) {
		System.out.println("TV 소리를 끄세요.");
		this.volume = volume;
		
	}

	@Override
	public void turnUp(int volume) {
		System.out.println("TV 소리를 올리세요.");
		this.volume += volume;
		
	}

	@Override
	public void turnDown(int volume) {
		System.out.println("TV 소리를 내리세요.");
		this.volume -= volume;
		
	}

	
	
 }
class Radio implements AdvancedVolume{
	 private int volume;
	 	
	@Override
	public void turnOn(int volume) {
		// TODO Auto-generated method stub
		System.out.println("TV 소리를 켜세요.");
		this.volume = volume;
	}
	@Override
	public void turnOff(int volume) {
		// TODO Auto-generated method stub
		System.out.println("TV 소리를 끄세요.");
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
		System.out.println("라디오 소리를 높히세요");
		this.volume += volume;
	}

	@Override
	public void turnDown(int volume) {
		System.out.println("라디오 소리를 낮추세요");
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
