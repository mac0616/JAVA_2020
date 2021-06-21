package Test;

public class BaewhaStudent { //클래스
	public static String school="배화여대";  //공통변수
	public static int sreialId=100;  //공통변수학번
	private int id;        //멤버변수 학번
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
		else System.out.println("음수는 안돼요");
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
		else System.out.println("음수는 안돼요");
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		if(height>0)
		this.height = height;
		else System.out.println("음수는 안돼요");
	}

	public void show_Information() { //메소드
		System.out.println("학교: " + school +" 학과: " + department + " 학번: " + id + " 주소: " + address);
	}
	
}
