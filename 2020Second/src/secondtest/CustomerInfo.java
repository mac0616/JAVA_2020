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
		minsu.name="김민수";
		minsu.grade="star";
		minsu.point=325;
		minsu.amount="250,000원";
		minsu.address="서울시 종로구 필운동 필운대로 1길 34 배화여대";
		System.out.println("고객 ID : " + minsu.ID );
		System.out.println("고객이름 : " + minsu.name );
		System.out.println("고객등급 : " + minsu.grade );
		System.out.println("고객포인트 : " + minsu.point );
		System.out.println("사용금액 : " + minsu.amount );
		System.out.println("고객주소 : " + minsu.address );
	}

}

