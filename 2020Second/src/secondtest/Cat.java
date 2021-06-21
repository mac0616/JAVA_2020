package secondtest;

public class Cat {
	
	//멤버변수
	String name;     
	int age;
	boolean female = true;
	String color;
	String address;
	
	//메소드
	public void run(){
		System.out.println("고양이는 달립니다");
	}
	public void eat() {
		System.out.println("고양이는 먹습니다");
	}

	
	public static void main(String[] args) {
		Cat cat = new Cat();  //인스턴스
		System.out.println("고양이 클래스를 생성합니다");
		cat.run();
		 cat.eat();

	}

}
