package secondtest;

public class Bmitogether {
	double weight;
	double height;
	double bmi;
	
	public void calcuateBMI() {
		bmi = weight/height*height;  
		if(bmi>=23 && bmi<25)
			System.out.println("과체중");
		else if (bmi>=25 && bmi<30)
			System.out.println("경도비만");
		else if (bmi>30)
			System.out.println("고도비만");
		else System.out.println("정상 또는 저체중");
	}

	public static void main(String[] args) {
		Bmitogether myBMI = new Bmitogether();
		myBMI.height = 1.55;  //m
		myBMI.weight=55.6; //kg
		myBMI.calcuateBMI();
		System.out.println("나의 BMI: %6.2f"+ myBMI.bmi);
	}
}
