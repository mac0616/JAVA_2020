package Test;
import java.util.*;
public class Test113 {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요==>");
		int num = myScan.nextInt();
		int a = num/1000; 
		for(int i=1; i<=a; i++) {
			System.out.print("#");
		}
		System.out.println();
		int b = num%1000/100; 
		for(int i=1; i<=b; i++) {
			System.out.print("#");
		}
		System.out.println();
		int c = num%1000%100/10; 
		for(int i=1; i<=c; i++) {
			System.out.print("#");
		}
		System.out.println();
		int d = num%1000%100%10; 
		for(int i=1; i<=d; i++) {
			System.out.print("#");
		}
	}
}
