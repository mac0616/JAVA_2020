package secondtest;

public class StudentInfo {
	String name;
	int age;
	int grade;
	String address;
	
	public void wakeup(){
		System.out.println("�л��� �Ͼ���ϴ�");
	}
	public void gotoSchool(){
		System.out.println("�л��� �б��� ���ϴ�");
	}
	public void gotoHome(){
		System.out.println("�л��� ���� �ɴϴ�");
	}
	public void gotoBed(){
		System.out.println("�л��� ���� ��ϴ�");
	}

	public static void main(String[] args) {
		StudentInfo yuna = new StudentInfo();
		System.out.println("�л� �ν���Ʈ�� ����������");
		yuna.wakeup();
		yuna.gotoSchool();
		yuna.gotoHome();
		yuna.gotoBed();

	}

}