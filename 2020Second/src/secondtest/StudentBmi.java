package secondtest;

public class StudentBmi {
	String name;
	double height;
	double weight;
	
	public StudentBmi(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void showBMI() {
		double bmi=weight/(height*height);
		System.out.println("BMI 지수는: "+ bmi);
		if (bmi>=23 && bmi<25)
			System.out.println("과체중");
		else if (bmi>=25 && bmi<30)
			System.out.println("경도비만");
		else if (bmi>=30)
			System.out.println("고도비만");
		else System.out.println("정상 또는 저체중");
	}
	
	public static void main(String[] args) {
	StudentBmi james = new StudentBmi("james", 1.69, 87.9);
	james.showBMI();
	}
}