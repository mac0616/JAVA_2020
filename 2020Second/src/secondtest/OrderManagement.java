package secondtest;

public class OrderManagement {
	String ordernum;
	String ID;
	String day;
	String name;
	String address;

	public static void main(String[] args) {
		OrderManagement minsu= new OrderManagement();
		minsu.ordernum="20200801021A12";
		minsu.ID="A3456";
		minsu.day="2020�� 9�� 3��";
		minsu.name="��μ�";
		minsu.address="����� ���α� �ʿ �ʿ��� 1�� 34 ��ȭ����";
		System.out.println("�ֹ���ȣ : "+ minsu.ordernum);
		System.out.println("�ֹ���ID : "+ minsu.ID);
		System.out.println("�ֹ���¥ : "+ minsu.day);
		System.out.println("�ֹ����̸� : "+ minsu.name);
		System.out.println("����ּ� : "+ minsu.address);
	}
}
