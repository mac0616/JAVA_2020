package secondtest;

public class Cat {
	
	//�������
	String name;     
	int age;
	boolean female = true;
	String color;
	String address;
	
	//�޼ҵ�
	public void run(){
		System.out.println("����̴� �޸��ϴ�");
	}
	public void eat() {
		System.out.println("����̴� �Խ��ϴ�");
	}

	
	public static void main(String[] args) {
		Cat cat = new Cat();  //�ν��Ͻ�
		System.out.println("����� Ŭ������ �����մϴ�");
		cat.run();
		 cat.eat();

	}

}
