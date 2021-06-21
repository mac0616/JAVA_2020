package secondtest;

public class Test73 {
	double weight=80;
	double height=1.75;
	double bmi;
	
	public void result() {
		if (bmi>=30)
			System.out.println("고도비만");
		else if (bmi>=25)
			System.out.println("경도비만");
		else if (bmi>=23)
			System.out.println("과체중");
		else if (bmi>=18.5)
			System.out.println("정상");
		else System.out.println("저체중");
	}
	public static void main(String[] args) {
		Test73 bmiresult = new Test73();
		System.out.print("BMI지수는 :");
		bmiresult.result();
	}

}