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
		System.out.println("BMI ������: "+ bmi);
		if (bmi>=23 && bmi<25)
			System.out.println("��ü��");
		else if (bmi>=25 && bmi<30)
			System.out.println("�浵��");
		else if (bmi>=30)
			System.out.println("����");
		else System.out.println("���� �Ǵ� ��ü��");
	}
	
	public static void main(String[] args) {
	StudentBmi james = new StudentBmi("james", 1.69, 87.9);
	james.showBMI();
	}
}