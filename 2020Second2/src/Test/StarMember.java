package Test;

public class StarMember {
	int id;
	private String name;
	String address;
	int num_of_use;
	int fee;

	
	public StarMember(int id, String name, String address, int num_of_use) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.num_of_use = num_of_use;
		this.fee = 30;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int discount_fee() {
		if(num_of_use>=5 && fee==30)
			return (int) (fee*0.8);
		else return fee;
	}
	
	public void showinfo() {
		System.out.println("이름은 " + name + "사용횟수는 " + num_of_use + " 월비용은  " + fee + "입니다." );
	}
}