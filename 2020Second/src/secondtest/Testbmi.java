package secondtest;

public class Testbmi {
	   public static void BMI(double weight, double height) {
	      double bmi= (double) weight/(height*height);
	      System.out.printf("%.2f로 ", bmi);
	       if (bmi>=30)
	            System.out.println("고도비만입니다");
	        else if (bmi>= 25)
	            System.out.println("경도비만입니다");
	        else if (bmi >= 23)
	            System.out.println("과체중입니다");
	        else if (bmi>=18.5)
	            System.out.println("정상입니다");
	        else 
	            System.out.println("저체중입니다");
	   }
	   public static void main(String[] args) {
	      double weight = 80;
	      double height = 1.75;
	      System.out.print("BMI지수 : ");
	      BMI(weight, height);
	      
	   }
	}