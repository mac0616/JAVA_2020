package secondtest;

public class RateTest {

	public static void main(String[] args) {
		int capability = 96;
		int reserve = 86;
		double rate = 0.0;
		
		rate = (double)reserve/capability * 100;
		System.out.println("�߱��� �����ο� " + capability + "�����ο� "+ reserve +
				"�������� " + rate + "%�Դϴ�");
		System.out.printf("�߱��� �����ο� : %d �����ο� : %d ������ : %6.2f �Դϴ�", capability,
				reserve, rate);
	}

}
