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
	System.out.println("나이는" + name + "이고 ID는 " + customerID +
			" 방문횟수는 " + theNumberofVisit +" 고객만족도는 " + satisfication
			+" 전화번호는 " + cellphone + "입니다");	
	}

	public static void main(String[] args) {
		StarCustomer customer1 = new StarCustomer("이채연", 12);
		StarCustomer customer2 = new StarCustomer("sandy", 14, "010-00100-1234");
		StarCustomer customer3 = new StarCustomer("park", 105, 5, "010-1234-5678");
		
		customer1.showInfo();
		customer2.showInfo();
		customer3.showInfo();

	}

}
