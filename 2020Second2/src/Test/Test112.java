package Test;
import java.util.Scanner;
public class Test112 {

	public static void main(String[] args) {
		int i=0; char c;
		Scanner myScan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���");
		String str = myScan.nextLine();
		int Dae=0, so=0, num=0, extra=0;
		for(i=0; i<str.length()-1; i++) {
			c=str.charAt(i);
			if(c>='A' && c<='Z')
				Dae++;
			else if(c>='a' && c<='z')
			so++;
			else if (c>='0' && c<='9')
				num++;
			else extra++;
		}
		System.out.println("�빮�ڴ� " + Dae + "�� �ҹ��ڴ� "+
		so+ "�� ���ڴ� " + num + "�� �Դϴ�.");
		System.out.println("�׹ۿ� ���ڴ� " + extra + "�� �Դϴ�.");
	}

}
