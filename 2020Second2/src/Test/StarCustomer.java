package Test;

public class StarCustomer {
	private int customernum;
	private String name;
	public double customersf=4.0;
	private int usetime;
	public int cuppon;
	
	public StarCustomer(int customernum, String name, double customersf, int usetime, int cuppon) {
		super();
		this.customernum = customernum;
		this.name = name;
		this.customersf=4.0;
		this.usetime = usetime;
		this.cuppon = cuppon;
	}
	
	
	public int getCustomernum() {
		return customernum;
	}


	public void setCustomernum(int customernum) {
		if(customernum>0)
			this.customernum = customernum;
			else System.out.println("������ �ȵſ�");
	}


	public int getUsetime() {
		return usetime;
	}


	public void setUsetime(int usetime) {
		if(usetime>0)
			this.usetime = usetime;
			else System.out.println("������ �ȵſ�");
	}


	public void show_info() {
		if(usetime>=10)
			System.out.println(cuppon=cuppon+1);
		
		System.out.println("����ȣ: " + customernum + " �̸�: " + name + " ��������: " + customersf 
				+ " �����ȸ��: " + usetime + " ��������: " + cuppon);
	}
	
}
