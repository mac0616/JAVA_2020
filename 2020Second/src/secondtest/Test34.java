package secondtest;

public class Test34 {

	public static void main(String[] args) {
		int myage = 20;
		int momage = myage*2+5;
		int fatage = (int) (myage*2.5-3);
		boolean check = momage > fatage;
		
		System.out.println("엄마나이가 아빠나이보다 더 많은가요?" + check);
		System.out.printf("엄마나이sms %d이고, 아빠나이는 %d입니다.",momage, fatage);

	}

}
