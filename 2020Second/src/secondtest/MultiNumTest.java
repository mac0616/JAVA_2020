package secondtest;

import test.MultiNum;
import test. Addnum;

public class MultiNumTest {

	public static void main(String[] args) {
		
		int a=2, b=5, sum=0;
		double x=2.5, y=6.5, total=0.0;
		
		MultiNum mn = new MultiNum();
		Addnum an = new Addnum();
		
		sum = mn.mulNum(a,b);
		System.out.println(a+"*"+b+"="+sum);
		total = mn.mulNum(x,y);
		System.out.println(x+"*"+y+"="+total);
		total = an.add(y, x);
		System.out.println(y+"+"+x+"="+total);

	}

}
