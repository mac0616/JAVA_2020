package secondtest;

public class Student {
	String ID;
	String name;
	double height;
	double weight;
	
	public Student(String iD, String name, double height, double weight) {
		super();
		ID = iD;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("�й�: " + ID);
		System.out.println("�̸�: " + name);
		System.out.println("Ű: " +height);
		System.out.println("������: " +weight);
		
	}
	public static void main(String[] args) {
		Student mike = new Student("A1012", "mike", 172.5, 68.5);
		mike.showInfo();
	}
}
