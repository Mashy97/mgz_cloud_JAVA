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
		System.out.printf("��� : %s, �̸� : %s, �Ի����� : %s",no ,name,initDay);
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
		Regular emp = new Regular("R001","�ϱ浿","2022-01-01",3000000);
		//�����ȣ�� R001�� ����� �⺻ ���� ��ȸ
		System.out.printf("��ȣ : %s, �̸� : %s, �Ի� ���� : %s",emp.no,emp.name,emp.initDay);
		//�����ȣ�� R001�� ����� �޿� ��ȸ
		System.out.printf("�޿� : %,d",emp.pay);
	
	}
	
}
