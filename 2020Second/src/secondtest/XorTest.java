package secondtest;

public class XorTest {

	public static void main(String[] args) {
		byte plainText = 35;
		byte secretecode = 13;
		
		System.out.println("ģ������ �������� ���� : " + plainText);
		byte encryption = (byte) (plainText^secretecode);
		
		System.out.println("ģ������ ������ ��ȣ�� : " + encryption);
		byte decryption = (byte) (encryption^secretecode);
		
		System.out.println("ģ���� ������ ��ȣ�� : " + decryption);
	}

}
