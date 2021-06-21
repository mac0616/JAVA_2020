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
			System.out.print(i+"번째 학번을 입력하세요 : ");
			id = scan.nextInt();
			scan.nextLine();
			System.out.print("이름을 입력하세요 : ");
			name=scan.nextLine();
			System.out.print("연락처를 입력하세요 : ");
			address=scan.nextLine();
			System.out.print("사용횟수를 입력하세요 : ");
			use_time=scan.nextInt();
			scan.nextLine();
			sm.add(new StarMember(id, name, address, use_time));
		}
		scan.close();
		
		System.out.println("*********전체출력**********");
		for(StarMember smr : sm) {
			smr.showinfo();
		}
		
		System.out.println("*********삭제후 출력**********");
		sm.remove(2);
		for(StarMember smr : sm) {
				smr.showinfo();
	}
		System.out.println("*********3번째 요소 출력**********");
		sm.get(3).showinfo();
}
}
