package secondtest;

public class Allowance {

	public static void main(String[] args) {
		int money = 4000+7000+2500;
		int monthM = money * 24;
		double myMax = monthM + monthM * 0.15;
		double myMin = monthM - monthM * 0.05;
		
		System.out.println("�Ϸ�뵷 : " + money + "��  �Ѵ޿뵷 : " + monthM + "��  �뵷 �ְ�� : " +
		(int)myMax + "��  �뵷������ : " + (int)myMin + "��");

	}

}
