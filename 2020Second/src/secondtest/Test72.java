package secondtest;

public class Test72 {  //Ŭ����
	String id;  //�������
	String name;
	String department;
	String address;
	
	public void Test72(){  //�޼���
		System.out.println("�й� : " + id);
		System.out.println("�̸� : " + name);
		System.out.println("�а� : " + department);
		System.out.println("�ּ� : " + address);
	}
	
	
	public static void main(String[] args) {
		Test72 student = new Test72();
		student.id="A1012";
		student.name="ȫ�浿";
		student.department="������ȣ��";
		student.address="����� ���α� �ʿ";
		student.Test72();
		
		
		
	}

}
