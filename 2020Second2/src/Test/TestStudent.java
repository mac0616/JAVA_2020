package Test;

public class TestStudent {

	public static void main(String[] args) {
		BaewhaStudent lee = new BaewhaStudent("�̹���","������ȣ��", "����� ���α� �ʿ",58.5,1.75);
		BaewhaStudent kim = new BaewhaStudent("�����","������ȣ��", "����� ���ʱ� ������",76,1.78);
		BaewhaStudent park = new BaewhaStudent("�ڹ���","������ȣ��", "����� ���ε�",45.2,1.54);
		lee.setheight(-12.5);
		lee.show_Information();
		kim.show_Information();
		park.show_Information();

	}

}
