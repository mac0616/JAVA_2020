package secondtest;

public class Testbmi {
	   public static void BMI(double weight, double height) {
	      double bmi= (double) weight/(height*height);
	      System.out.printf("%.2f�� ", bmi);
	       if (bmi>=30)
	            System.out.println("�����Դϴ�");
	        else if (bmi>= 25)
	            System.out.println("�浵���Դϴ�");
	        else if (bmi >= 23)
	            System.out.println("��ü���Դϴ�");
	        else if (bmi>=18.5)
	            System.out.println("�����Դϴ�");
	        else 
	            System.out.println("��ü���Դϴ�");
	   }
	   public static void main(String[] args) {
	      double weight = 80;
	      double height = 1.75;
	      System.out.print("BMI���� : ");
	      BMI(weight, height);
	      
	   }
	}