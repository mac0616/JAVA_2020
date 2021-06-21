package Test;

public class Customer {
	public static int serialId=100;  //공유변수=스테틱 변수=클래스변수
	String name;  //멤버변수
	int id;
	int point;
	int money;
	public Customer() {}
	public Customer(String name) {
		this.name = name;
		id = serialId++;
	}
	public void show_Info() {
		System.out.println("이름은 " + name + "회원번호는 " +id + " 입니다.");
	}
	
	
}
