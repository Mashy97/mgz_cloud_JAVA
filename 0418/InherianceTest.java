//super class (상위 클래스)

//
class Employee {

	String no;
	String name;
	String initDay;
	
	
	Employee(){
		
	}
	
	Employee(String no, String name, String initDay){
		this.no = no;
		this.name = name;
		this.initDay = initDay;
	}
	
	public int payCheck() {
		return 0;
	}
	//사원의 기본정보를 콘솔에 출력

}


//sub class
class Regular extends Employee{
	//인스턴스 변수
	int pay;
	//디폴트 생성자 메소드
	
	Regular (){
		super();
	}
	
	//메개변수 생성자 메소드
	Regular(String no, String name, String initDay, int pay){
		super(no,name,initDay); // super은 첫라인에만 
		this.pay = pay;
	}
	
	public int payCheck() {
		return pay;
	}
	
	public void printEmployee(){
		System.out.printf("사번 : %s, 이름 : %s, 입사일자 : %s, 급여 : %,d%n",no ,name, initDay, pay);

		
	}
	
	
}
//end of Rugular class

class Daily extends Employee{

	private int workDay;
	private	int DailyPay;
	
	Daily(){
		super();
	}
	
	Daily(String no, String name, String initDay,int workDay, int DailyPay){
		super(no, name,initDay);
		this.workDay = workDay;
		this.DailyPay = DailyPay;
	}
	
	public int payCheck() {
		return workDay * DailyPay;
	}

	public void printEmployee(){
		System.out.printf("사번 : %s, 이름 : %s, 입사일자 : %s, 급여 : %,d%n",no ,name, initDay, workDay * DailyPay);
	}
}
//end of Daily class

//sub class :영업직 사원
class Sales extends Regular{
	private int sales;
	private double commission;
	
	Sales(){
		super();
	}
	
	Sales(String no, String name, String initDay, int pay, int sales){
		super(no,name,initDay,pay);
		this.sales = sales;
		setCommission();
	}
	//commission 설정
	public void setCommission() {
		if(sales>=10000000) {
			commission = 0.1;
		}
		else if(sales>=5000000){
			commission = 0.05;
		}
		else if(sales>=2000000) {
			commission = 0.02;
		}
		else {
			commission = 0;
		}
	}
}

public class InherianceTest {
	public static void main(String[] args) {
			
		// 정규직 사원 생성
		Regular emp01 = new Regular("R001","일길동","2022-01-01",3000000);
		
	
		// 사번이 "R001"인 사람의 급여를 조회하시오.
		int pay = emp01.payCheck();
		System.out.printf("급여 : %,d원%n",pay);
		
		Daily emp02 = new Daily("D001","이길동","2002-02-01",20,100000);
		pay = emp02.payCheck();
		System.out.printf("급여 : %,d원%n",pay);
		
		emp01.printEmployee();
		emp02.printEmployee();
		
	}
}
