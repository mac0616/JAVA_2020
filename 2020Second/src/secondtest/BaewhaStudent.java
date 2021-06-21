package secondtest;

public class BaewhaStudent {
	String ID;
	String name;
	String department;
	String address;

	public BaewhaStudent(String iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public BaewhaStudent(String iD, String name, String department) {
		super();
		ID = iD;
		this.name = name;
		this.department = department;
	}

	
	public BaewhaStudent(String iD, String name, String department, String address) {
		super();
		ID = iD;
		this.name = name;
		this.department = department;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("�й�: " + ID);
		System.out.println("�̸�: " + name);
		System.out.println("�а�: " + department);
		System.out.println("�ּ�: " +address);
	}

	public static void main(String[] args) {
		BaewhaStudent hong = new BaewhaStudent("A1012", "ȫ�浿", "������ȣ��", "���� ���α� �ʿ");
		BaewhaStudent lee = new BaewhaStudent("A1022","�̱浿 ");
		hong.showInfo();
		lee.showInfo();
	}

}
