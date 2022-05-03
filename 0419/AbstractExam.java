abstract class Employee{
	String no; 
	String name;
	String initDay;
	
	public Employee() {
		super();
	}
	
	Employee(String no, String name, String initDay){
		super();
		this.no = no;
		this.name = name;
		this.initDay = initDay;
	}
	
	public abstract int payCheck();
	
	public void printEmployee(){
		System.out.printf("사번 : %s, 이름 : %s, 입사일자 : %s",no ,name,initDay);
	}

}

class Regular extends Employee{
	
	int pay;
	
	Regular(){
		super();
	}
	
	Regular(String no, String name, String initDay, int pay){
		super(no,name,initDay);
		this.pay = pay;
	}
	public int payCheck() {
		return pay;
	}

	@Override
	public void printEmployee() {
		// TODO Auto-generated method stub
		super.printEmployee();
	}
}

public class AbstractExam {
	public static void main(String[] args) {
		Regular emp = new Regular("R001","일길동","2022-01-01",3000000);
		//사원번호가 R001인 사원의 기본 정보 조회
		System.out.printf("번호 : %s, 이름 : %s, 입사 일자 : %s",emp.no,emp.name,emp.initDay);
		//사원번호가 R001인 사원의 급여 조회
		System.out.printf("급여 : %,d",emp.pay);
	
	}
	
}
