package Test;

public class SimpleTest {
	public static void show_me() {
		String name="��̿�";
		System.out.println(name);
				
	}
	public static void main(String[] args) {
		//SimpleTest  aaa = new SimpleTest();  static ������ ��� ��
		int sum = 0;
		int i=0;
		for(i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println("���� " + sum + " i ���� " +i);
		//aaa.show_me();   static ������ show_me();�� �־��
		show_me();
		SimpleTest.show_me();
	}

}
