package secondtest;

public class Test41 {

	public static void main(String[] args) {
		int age=21; 
		int chest=90;
		char size;
		
		if(age<20) {
			if(chest<85)
				size='S';
			else if(chest>=85 && chest <95)
					size = 'M';
					else size = 'L';
		}
		else {
			if(chest<90)
				size='S';
			else if(chest>=90 && chest <100)
					size = 'M';
					else size = 'L';
		}
		System.out.println("���̰� " + age + "�̰� �����ѷ��� " + chest + "�� ��� �� ������� " + size + "�Դϴ�");
		
			
		}

}
