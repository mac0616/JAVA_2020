package Test;

import java.util.*;

public class StarTest {

	public static void main(String[] args) {
		
		ArrayList<StarMember> sm = new ArrayList<StarMember>();
		Scanner scan = new Scanner(System.in);
		int id=0, use_time=0;
		String name, address;
		
		for(int i=0; i<1; ++i) {
			System.out.println("******************");
			System.out.print(i+"��° �й��� �Է��ϼ��� : ");
			id = scan.nextInt();
			scan.nextLine();
			System.out.print("�̸��� �Է��ϼ��� : ");
			name=scan.nextLine();
			System.out.print("����ó�� �Է��ϼ��� : ");
			address=scan.nextLine();
			System.out.print("���Ƚ���� �Է��ϼ��� : ");
			use_time=scan.nextInt();
			scan.nextLine();
			sm.add(new StarMember(id, name, address, use_time));
		}
		scan.close();
		
		System.out.println("*********��ü���**********");
		for(StarMember smr : sm) {
			smr.showinfo();
		}
		
		System.out.println("*********������ ���**********");
		sm.remove(2);
		for(StarMember smr : sm) {
				smr.showinfo();
	}
		System.out.println("*********3��° ��� ���**********");
		sm.get(3).showinfo();
}
}
