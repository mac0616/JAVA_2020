package secondtest;

public class Test73 {
	double weight=80;
	double height=1.75;
	double bmi;
	
	public void result() {
		if (bmi>=30)
			System.out.println("����");
		else if (bmi>=25)
			System.out.println("�浵��");
		else if (bmi>=23)
			System.out.println("��ü��");
		else if (bmi>=18.5)
			System.out.println("����");
		else System.out.println("��ü��");
	}
	public static void main(String[] args) {
		Test73 bmiresult = new Test73();
		System.out.print("BMI������ :");
		bmiresult.result();
	}

}