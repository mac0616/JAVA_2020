package Test;
public class Test51 {
	public static void main(String[] args) {
		
			for(int i=0; i<5; i++){
				for(int j=0; j<=5-i; j++){
					System.out.print(" ");
				}
				for(int k=0; k<=i*2; k++){
					System.out.print("*");
				}
				System.out.println();
			}

			for(int i=3; i>=0; i--){
				for(int j=i; j<=5; j++){
					System.out.print(" ");
				}
				for(int k=0; k<=i*2; k++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}



	//��ó: https://peace3303.tistory.com/entry/JAVA-�������̾Ƹ�� [C a r p e d i e m]