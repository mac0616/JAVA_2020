package secondtest;

public class Test91 {

	public static void main(String[] args) {
		int[] a = new int[] {2, 4, 6, 8, 10, 12, 16, 18, 20};
		int[] b = new int[10];
		
		for(int i=0; i<a.length; i++) {
			b[i]=a[i]*a[i];
		}
		for(int i=0; i<a.length; i++) {
			System.out.printf("%d의 제곱은 %d입니다.",a[i],b[i] );
			System.out.println();
		}
	}
}
