class Employe{
	String name;
	String department;
	
	Employe(){
	}
	
	Employe(String name, String department){
		this.name = name;
		this.department = department;
	}
	
	public int pay() {
		return 0;
	}
}

class regulars extends Employe{
	int num;
	int yearSalary;
	int bonusRate;
	
	regulars(){
	}
	
	regulars(String name, String department, int num, int yearSalary, int bonusRate){
		super(name,department);
		this.yearSalary = yearSalary;
		this.bonusRate = bonusRate;
	}
	
	public int pay() {
		return yearSalary + bonusRate;
	}
}

class notregular extends Employe{
	String expiration;
	int basicPay;
	
	
	public notregular() {
	}
	
	notregular(String name, String department, String expiration, int basicPay){
		super(name,department);
		this.expiration = expiration;
		this.basicPay = basicPay;
	}
}

class temporary extends notregular{
	int payRate;
	int workHours;
	
	public temporary() {
	}
	
	temporary(String name, String department, String expiration, int basicPay, int payRate, int workHours){
		super(name,department,expiration,basicPay);
		this.payRate = payRate;
		this.workHours = workHours;
	}
	
	public int pay() {
		return this.basicPay + payRate * workHours;
	}
}


class internship extends notregular{
	int payPercent;

	
	public internship() {
	}
	
	internship(String name, String department, String expiration, int basicPay, int payPercent){
		super(name,department,expiration,basicPay);
		this.payPercent = payPercent;
	}
	
	public int pay() {
		return this.basicPay + payPercent;
	}
}


public class Test_0418 {
	public static void main(String[] args) {
		internship intern = new internship("일길동","기획","2022-01-11",100000,1000);
		
		System.out.printf("%s님의 급여는 : %,d원 입니다.%n",intern.name,intern.pay());
		
	}
}
