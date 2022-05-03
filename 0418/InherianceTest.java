//super class (���� Ŭ����)

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
	//����� �⺻������ �ֿܼ� ���

}


//sub class
class Regular extends Employee{
	//�ν��Ͻ� ����
	int pay;
	//����Ʈ ������ �޼ҵ�
	
	Regular (){
		super();
	}
	
	//�ް����� ������ �޼ҵ�
	Regular(String no, String name, String initDay, int pay){
		super(no,name,initDay); // super�� ù���ο��� 
		this.pay = pay;
	}
	
	public int payCheck() {
		return pay;
	}
	
	public void printEmployee(){
		System.out.printf("��� : %s, �̸� : %s, �Ի����� : %s, �޿� : %,d%n",no ,name, initDay, pay);

		
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
		System.out.printf("��� : %s, �̸� : %s, �Ի����� : %s, �޿� : %,d%n",no ,name, initDay, workDay * DailyPay);
	}
}
//end of Daily class

//sub class :������ ���
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
	//commission ����
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
			
		// ������ ��� ����
		Regular emp01 = new Regular("R001","�ϱ浿","2022-01-01",3000000);
		
	
		// ����� "R001"�� ����� �޿��� ��ȸ�Ͻÿ�.
		int pay = emp01.payCheck();
		System.out.printf("�޿� : %,d��%n",pay);
		
		Daily emp02 = new Daily("D001","�̱浿","2002-02-01",20,100000);
		pay = emp02.payCheck();
		System.out.printf("�޿� : %,d��%n",pay);
		
		emp01.printEmployee();
		emp02.printEmployee();
		
	}
}
