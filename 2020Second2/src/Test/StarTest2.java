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
			System.out.print(i+"번째 학번을 입력하세요 : ");
			id = scan.nextInt();
			scan.nextLine();
			System.out.print("이름을 입력하세요 : ");
			name=scan.nextLine();
			System.out.print("몸무게(kg)를 입력하세요 : ");
			weight=scan.nextDouble();
			scan.nextLine();
			System.out.print("키(m)를 입력하세요 : ");
			height=scan.nextDouble();
			scan.nextLine();
			bmi=(weight/(height*height));
			sm2.add(new StarMember2(id, name, weight, height, bmi));
		}
		
		scan.close();
		System.out.println("***************전체출력****************");
		for(StarMember2 smr2 : sm2) {
			smr2.showinfo();
		}
		
		System.out.println("************정상체중 아닌 사람*************");
		for(StarMember2 smr2 : sm2) {
			if(smr2.bmi>23.0) {
				smr2.showinfo();}
}
}
}
