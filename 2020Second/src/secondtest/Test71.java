package secondtest;

public class Test71 {
	String name;    //�������
	private String id;
	int point;
	int money;
	int usetime;
	boolean cuppon=false;
	
	//�޼���
	public void check_usetime() {
		if(usetime>=10 && cuppon==false)
			cuppon = true;
		else cuppon = false;
	}
	
	public void showInfo(){
		System.out.println("�̸� : "+name+" ����ȣ : " +id + "����Ʈ" +point);
		System.out.println(" ���ݾ� : "+money + "���Ƚ�� : " +usetime + "�������� : "+cuppon);
}
	

	public static void main(String[] args) {
		Test71 customer = new Test71 ();  //�ν��Ͻ�
		System.out.println("���ν��Ͻ��� ����������");
		customer.check_usetime();
		customer.showInfo();
		
	}

}
