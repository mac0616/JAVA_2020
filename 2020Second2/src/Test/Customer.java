package Test;

public class Customer {
	public static int serialId=100;  //��������=����ƽ ����=Ŭ��������
	String name;  //�������
	int id;
	int point;
	int money;
	public Customer() {}
	public Customer(String name) {
		this.name = name;
		id = serialId++;
	}
	public void show_Info() {
		System.out.println("�̸��� " + name + "ȸ����ȣ�� " +id + " �Դϴ�.");
	}
	
	
}
