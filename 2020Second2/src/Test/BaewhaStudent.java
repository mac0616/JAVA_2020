package Test;

public class BaewhaStudent { //Ŭ����
	public static String school="��ȭ����";  //���뺯��
	public static int sreialId=100;  //���뺯���й�
	private int id;        //������� �й�
	private String name;
	public String department;
	public String address;
	private double weight;
	private double height;

	public BaewhaStudent(String name, String department, String address, double weight, double height) {
		super();
		this.id = sreialId++;
		this.name = name;
		this.department = department;
		this.address = address;
		this.weight = weight;
		this.height = height;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0)
		this.id = id;
		else System.out.println("������ �ȵſ�");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight>0)
		this.weight = weight;
		else System.out.println("������ �ȵſ�");
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		if(height>0)
		this.height = height;
		else System.out.println("������ �ȵſ�");
	}

	public void show_Information() { //�޼ҵ�
		System.out.println("�б�: " + school +" �а�: " + department + " �й�: " + id + " �ּ�: " + address);
	}
	
}
