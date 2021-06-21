package secondtest;

public class Test72 {  //클래스
	String id;  //멤버변수
	String name;
	String department;
	String address;
	
	public void Test72(){  //메서드
		System.out.println("학번 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + department);
		System.out.println("주소 : " + address);
	}
	
	
	public static void main(String[] args) {
		Test72 student = new Test72();
		student.id="A1012";
		student.name="홍길동";
		student.department="정보보호과";
		student.address="서울시 종로구 필운동";
		student.Test72();
		
		
		
	}

}
