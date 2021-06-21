package secondtest;

public class OrderManagement {
	String ordernum;
	String ID;
	String day;
	String name;
	String address;

	public static void main(String[] args) {
		OrderManagement minsu= new OrderManagement();
		minsu.ordernum="20200801021A12";
		minsu.ID="A3456";
		minsu.day="2020년 9월 3일";
		minsu.name="김민수";
		minsu.address="서울시 종로구 필운동 필운대로 1길 34 배화여대";
		System.out.println("주문번호 : "+ minsu.ordernum);
		System.out.println("주문자ID : "+ minsu.ID);
		System.out.println("주문날짜 : "+ minsu.day);
		System.out.println("주문자이름 : "+ minsu.name);
		System.out.println("배송주소 : "+ minsu.address);
	}
}
