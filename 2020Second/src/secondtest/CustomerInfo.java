package secondtest;

public class CustomerInfo {
	String ID;
	String name;
	String grade;
	int point;
	String amount;
	String address;
	
	public static void main(String[]args) {
		CustomerInfo minsu=new CustomerInfo();
		minsu.ID="A3456";
		minsu.name="��μ�";
		minsu.grade="star";
		minsu.point=325;
		minsu.amount="250,000��";
		minsu.address="����� ���α� �ʿ �ʿ��� 1�� 34 ��ȭ����";
		System.out.println("�� ID : " + minsu.ID );
		System.out.println("���̸� : " + minsu.name );
		System.out.println("����� : " + minsu.grade );
		System.out.println("������Ʈ : " + minsu.point );
		System.out.println("���ݾ� : " + minsu.amount );
		System.out.println("���ּ� : " + minsu.address );
	}

}

