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
		System.out.println("학번: " + ID);
		System.out.println("이름: " + name);
		System.out.println("학과: " + department);
		System.out.println("주소: " +address);
	}

	public static void main(String[] args) {
		BaewhaStudent hong = new BaewhaStudent("A1012", "홍길동", "정보보호과", "서울 종로구 필운동");
		BaewhaStudent lee = new BaewhaStudent("A1022","이길동 ");
		hong.showInfo();
		lee.showInfo();
	}

}
