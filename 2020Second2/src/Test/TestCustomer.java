package Test;

public class TestCustomer {

	public static void main(String[] args) {
		Customer linda = new Customer("linda");
		//System.out.println(linda.serialId); //CustomerŬ������ id = serialId++; ���Է� �� ��밡��
		//linda.id = linda.serialId ++;  //CustomerŬ������ id = serialId++; ���Է� �� ��밡��
		
		Customer mike = new Customer("mike");
		//System.out.println(mike.serialId);  //CustomerŬ������ id = serialId++; ���Է� �� ��밡��
		//mike.id = mike.serialId ++;  //CustomerŬ������ id = serialId++; ���Է� �� ��밡��
		
		System.out.println(Customer.serialId);
		
		linda.show_Info();
		mike.show_Info();
	}
}
