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
		System.out.println("나이가 " + age + "이고 가슴둘레가 " + chest + "인 경우 옷 사이즈는 " + size + "입니다");
		
			
		}

}
