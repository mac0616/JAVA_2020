package secondtest;

public class Test33 {

	public static void main(String[] args) {
		int numB = 67;
		int numG = 87;
		int benchB = numB/7;
		int benchG = numG/7;
		int check =benchB + benchG;

		if (numB % 7 >0)
			check++;
		if (numG % 7 >0)
			check++;
		System.out.println("��ü ��ġ���� : " + check);
		
		if (check >=30)
			System.out.println("10%����");
		else
			System.out.println("���� ����");

	}

}
