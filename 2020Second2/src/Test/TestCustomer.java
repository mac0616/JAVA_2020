package Test;

public class TestCustomer {

	public static void main(String[] args) {
		Customer linda = new Customer("linda");
		//System.out.println(linda.serialId); //Customer클래스의 id = serialId++; 미입력 시 사용가능
		//linda.id = linda.serialId ++;  //Customer클래스의 id = serialId++; 미입력 시 사용가능
		
		Customer mike = new Customer("mike");
		//System.out.println(mike.serialId);  //Customer클래스의 id = serialId++; 미입력 시 사용가능
		//mike.id = mike.serialId ++;  //Customer클래스의 id = serialId++; 미입력 시 사용가능
		
		System.out.println(Customer.serialId);
		
		linda.show_Info();
		mike.show_Info();
	}
}
