package secondtest;

public class RateTest {

	public static void main(String[] args) {
		int capability = 96;
		int reserve = 86;
		double rate = 0.0;
		
		rate = (double)reserve/capability * 100;
		System.out.println("야구장 수용인원 " + capability + "예매인원 "+ reserve +
				"예매율은 " + rate + "%입니다");
		System.out.printf("야구장 수용인원 : %d 예매인원 : %d 예매율 : %6.2f 입니다", capability,
				reserve, rate);
	}

}
