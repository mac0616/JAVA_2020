package secondtest;

public class Bmitogether {
	double weight;
	double height;
	double bmi;
	
	public void calcuateBMI() {
		bmi = weight/height*height;  
		if(bmi>=23 && bmi<25)
			System.out.println("��ü��");
		else if (bmi>=25 && bmi<30)
			System.out.println("�浵��");
		else if (bmi>30)
			System.out.println("����");
		else System.out.println("���� �Ǵ� ��ü��");
	}

	public static void main(String[] args) {
		Bmitogether myBMI = new Bmitogether();
		myBMI.height = 1.55;  //m
		myBMI.weight=55.6; //kg
		myBMI.calcuateBMI();
		System.out.println("���� BMI: %6.2f"+ myBMI.bmi);
	}
}
