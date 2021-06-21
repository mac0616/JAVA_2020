package secondtest;

import test.Addnum;
public class AddnumTest {

	public static void main(String[] args) {
		int a=1, b=2, sum=0;
		double x=1.5, y=2.3, total=0.0;
		
		Addnum ac = new Addnum();  //인스턴트 생성
		
		sum = ac.add(a,b);
		System.out.println(a+"+"+b+"+"+sum);
		total = ac.add(x,y);
		System.out.println(x+"+"+y+"+"+total);
		total = ac.add(y,b);
		System.out.println(y+"+"+b+"+"+total);
	}

}
