package Test;
import java.util.Scanner;
public class Test114 {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("�迭 ������?");
		int num = myScan.nextInt();
		int[] su = new int[num];
		
		int max=su[0], min=su[0];
		for(int i=0; i<su.length; i++) {
			System.out.print("���ڸ� �Է��ϼ���");
			su[i] = myScan.nextInt();
			
			if(i==0)min=su[i];
			if(max<su[i]) {
				max=su[i];
			}
			else if(min>su[i]) {
				min=su[i];
			}
			}
		System.out.println("�ִ밪�� " + max + " �ּҰ��� " + min);
	}

}
