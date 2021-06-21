package secondtest;

public class Test51 {

	public static void main(String[] args) {
		for (int i=1; i<=7; i=i+2) {
			//공백
			for (int j=1; j<=(7-(i/2+1)); j++) {
				System.out.print(" ");
			}
			//별
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//공백
			for (int j=1; j<=(7-(i/2)); j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
