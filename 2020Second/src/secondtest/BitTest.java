package secondtest;

public class BitTest {

	public static void main(String[] args) {
		int a = 5;    //0101
		int b = 10;   //1010
		
		int c = a&b;  //0000   0
		int d = a|b;  //1111  15
		
		System.out.println("����  : " + c);
		System.out.println("����  : " + d);
		
		int e = a<<3;    //00000101 =>00101000   40
						//5*2*2*2 = 40
		int f = e>>2;   //00001010    10
						//40 /2 /2 = 10
		
		System.out.println("���ʽ���Ʈ  : " + e);
		System.out.println("�����ʽ���Ʈ  : " + f);
	}

}
