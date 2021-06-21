package Test;

public class ClassStudent {
	int id;
	private String name;
	SimpleTest[ ] test;
	public ClassStudent(int id, String name) {
		this.id = id;
		this.name = name;
		test = new SimpleTest[3];
		for(int j=0; j<3; ++j)
			test[j]=new SimpleTest();
	}
}
