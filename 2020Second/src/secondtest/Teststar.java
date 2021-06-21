package secondtest;

public class Teststar {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=0; i<=4; i++) {
			for(j=i; j<=4; j++) {
				System.out.print(" ");
			}
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
		}
		for(j=0; j<=i-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
