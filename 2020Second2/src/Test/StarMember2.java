package Test;

public class StarMember2 {
	int id;
	private String name;
	String address;
	int num_of_use;
	int fee;
	double weight=0, height=0, bmi=0;

	public StarMember2(int id, String name,double weight, double height, double bmi) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmi=bmi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showinfo() {
		System.out.println("�̸��� " + name + "�����Դ� " + weight + " Ű��  " + height +" BMI������  " + bmi+"�Դϴ�." );
	}
}
