package Test;

public class Test53 {

	public static void main(String[] args) {
		int a;
		int b;
		for(a=2; a<=9; a++) {
			for (b=1; b<=9; b++) {
				if(a%2==0)
					continue;
				else if(a*b<=40)
				System.out.print(a+ "*"+b+ "=" +a*b +" " );
			}
			System.out.println();
		}

	}

}