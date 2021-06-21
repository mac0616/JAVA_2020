package secondtest;

public class XorTest {

	public static void main(String[] args) {
		byte plainText = 35;
		byte secretecode = 13;
		
		System.out.println("친구에게 보내려는 숫자 : " + plainText);
		byte encryption = (byte) (plainText^secretecode);
		
		System.out.println("친구에게 보내는 암호문 : " + encryption);
		byte decryption = (byte) (encryption^secretecode);
		
		System.out.println("친구가 번역한 복호문 : " + decryption);
	}

}
