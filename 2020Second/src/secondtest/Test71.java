package secondtest;

public class Test71 {
	String name;    //멤버변수
	private String id;
	int point;
	int money;
	int usetime;
	boolean cuppon=false;
	
	//메서드
	public void check_usetime() {
		if(usetime>=10 && cuppon==false)
			cuppon = true;
		else cuppon = false;
	}
	
	public void showInfo(){
		System.out.println("이름 : "+name+" 고객번호 : " +id + "포인트" +point);
		System.out.println(" 사용금액 : "+money + "사용횟수 : " +usetime + "쿠폰여부 : "+cuppon);
}
	

	public static void main(String[] args) {
		Test71 customer = new Test71 ();  //인스턴스
		System.out.println("고객인스턴스가 만들어졌어요");
		customer.check_usetime();
		customer.showInfo();
		
	}

}
