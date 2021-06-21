package secondtest;

public class Allowance {

	public static void main(String[] args) {
		int money = 4000+7000+2500;
		int monthM = money * 24;
		double myMax = monthM + monthM * 0.15;
		double myMin = monthM - monthM * 0.05;
		
		System.out.println("하루용돈 : " + money + "원  한달용돈 : " + monthM + "원  용돈 최고액 : " +
		(int)myMax + "원  용돈최저액 : " + (int)myMin + "원");

	}

}
