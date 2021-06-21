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
		System.out.println("학번: " + ID);
		System.out.println("이름: " + name);
		System.out.println("키: " +height);
		System.out.println("몸무게: " +weight);
		
	}
	public static void main(String[] args) {
		Student mike = new Student("A1012", "mike", 172.5, 68.5);
		mike.showInfo();
	}
}
