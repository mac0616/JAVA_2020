package Test;

public class Student {
	String studentnum;
	String name;
	String department;
	String phone;
	String address;

	public Student(String studentnum, String name, String phone) {
		super();
		this.studentnum = studentnum;
		this.name = name;
		this.phone = phone;
	}
	public void changName(String name) {
		this.name=name;
	}
	public void changdepartment(String department) {
		this.department=department;
	}
	public void changphone(String phone) {
		this.phone=phone;
	}
	public void changaddress(String address) {
		this.address=address;
	}
	public void show_Info() {
		System.out.println("�й�: " + studentnum + " �̸�: "+name + " ��ȭ��ȣ: "+phone);
	}
	public boolean searchstudentnum(String num) {
		if(studentnum == num) {
		System.out.printf("�й� %S�� �л��� �̸�: %S ��ȭ����: %S�Դϴ�. ", studentnum, name, phone);
		return true;
	}
	else {
		return false;	
	}
	}
}