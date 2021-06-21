package secondtest;

public class StudentInfo {
	String name;
	int age;
	int grade;
	String address;
	
	public void wakeup(){
		System.out.println("학생이 일어났습니다");
	}
	public void gotoSchool(){
		System.out.println("학생이 학교에 갑니다");
	}
	public void gotoHome(){
		System.out.println("학생이 집에 옵니다");
	}
	public void gotoBed(){
		System.out.println("학생이 잠을 잡니다");
	}

	public static void main(String[] args) {
		StudentInfo yuna = new StudentInfo();
		System.out.println("학생 인스턴트가 만들어졌어요");
		yuna.wakeup();
		yuna.gotoSchool();
		yuna.gotoHome();
		yuna.gotoBed();

	}

}