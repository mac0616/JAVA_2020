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
		System.out.println("학번: " + studentnum + " 이름: "+name + " 전화번호: "+phone);
	}
	public boolean searchstudentnum(String num) {
		if(studentnum == num) {
		System.out.printf("학번 %S인 학생은 이름: %S 전화번로: %S입니다. ", studentnum, name, phone);
		return true;
	}
	else {
		return false;	
	}
	}
}