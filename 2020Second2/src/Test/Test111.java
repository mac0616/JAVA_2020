package Test;
import java.util.*;
public class Test111 {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요==>");
		String str = myScan.nextLine();
		//apple==>elppa
		
		System.out.println("문자열을 거꾸로 출력하세요==>");
		for(int i = str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}

	}

}
