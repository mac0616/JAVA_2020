package Test;

import java.util.*;

public class StarTest2 {
	
	public static void main(String[] args) {
		double weight=0, height=0;
		double bmi=0;
		int id=0;
		String name;
		
		ArrayList<StarMember2> sm2 = new ArrayList<StarMember2>();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; ++i) {
			System.out.println("***********************************");
			System.out.print(i+"��° �й��� �Է��ϼ��� : ");
			id = scan.nextInt();
			scan.nextLine();
			System.out.print("�̸��� �Է��ϼ��� : ");
			name=scan.nextLine();
			System.out.print("������(kg)�� �Է��ϼ��� : ");
			weight=scan.nextDouble();
			scan.nextLine();
			System.out.print("Ű(m)�� �Է��ϼ��� : ");
			height=scan.nextDouble();
			scan.nextLine();
			bmi=(weight/(height*height));
			sm2.add(new StarMember2(id, name, weight, height, bmi));
		}
		
		scan.close();
		System.out.println("***************��ü���****************");
		for(StarMember2 smr2 : sm2) {
			smr2.showinfo();
		}
		
		System.out.println("************����ü�� �ƴ� ���*************");
		for(StarMember2 smr2 : sm2) {
			if(smr2.bmi>23.0) {
				smr2.showinfo();}
}
}
}
