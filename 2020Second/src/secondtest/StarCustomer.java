package secondtest;

public class StarCustomer {
	String name;
	int customerID;
	int theNumberofVisit;
	double satisfication=4.0;
	String cellphone;

	public StarCustomer(String name, int customerID) {
		super();
		this.name = name;
		this.customerID = customerID;
	}
	
	public StarCustomer(String name, int customerID, String cellphone) {
		super();
		this.name = name;
		this.customerID = customerID;
		this.cellphone = cellphone;
	}

	public StarCustomer(String name, int customerID, int theNumberofVisit, String cellphone) {
		super();
		this.name = name;
		this.customerID = customerID;
		this.theNumberofVisit = theNumberofVisit;
		this.cellphone = cellphone;
	}
	
	public void showInfo() {
	System.out.println("���̴�" + name + "�̰� ID�� " + customerID +
			" �湮Ƚ���� " + theNumberofVisit +" ���������� " + satisfication
			+" ��ȭ��ȣ�� " + cellphone + "�Դϴ�");	
	}

	public static void main(String[] args) {
		StarCustomer customer1 = new StarCustomer("��ä��", 12);
		StarCustomer customer2 = new StarCustomer("sandy", 14, "010-00100-1234");
		StarCustomer customer3 = new StarCustomer("park", 105, 5, "010-1234-5678");
		
		customer1.showInfo();
		customer2.showInfo();
		customer3.showInfo();

	}

}
