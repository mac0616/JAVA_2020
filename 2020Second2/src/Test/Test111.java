package Test;
import java.util.*;
public class Test111 {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���==>");
		String str = myScan.nextLine();
		//apple==>elppa
		
		System.out.println("���ڿ��� �Ųٷ� ����ϼ���==>");
		for(int i = str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}

	}

}
