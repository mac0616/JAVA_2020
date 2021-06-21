package Test;

public class SimpleTest {
	public static void show_me() {
		String name="김미영";
		System.out.println(name);
				
	}
	public static void main(String[] args) {
		//SimpleTest  aaa = new SimpleTest();  static 있으면 없어도 됨
		int sum = 0;
		int i=0;
		for(i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println("합은 " + sum + " i 값은 " +i);
		//aaa.show_me();   static 있으면 show_me();만 있어도됨
		show_me();
		SimpleTest.show_me();
	}

}
