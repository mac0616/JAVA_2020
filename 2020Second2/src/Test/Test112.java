package Test;
import java.util.Scanner;
public class Test112 {

	public static void main(String[] args) {
		int i=0; char c;
		Scanner myScan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
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
		System.out.println("대문자는 " + Dae + "개 소문자는 "+
		so+ "개 숫자는 " + num + "개 입니다.");
		System.out.println("그밖에 문자는 " + extra + "개 입니다.");
	}

}
