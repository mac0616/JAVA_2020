package Test;

public class Classroom {
	public static void main(String[] args) {
		Student[] classroom = new Student[5];
		classroom[0]= new Student(1, "����");
		classroom[0].test[0].setScore("����",92);
		classroom[0].test[1].setScore("����",65);
		classroom[0].test[2].setScore("����",60);
		
		classroom[1]= new Student(2, "����");
		classroom[1].test[0].setScore("����",75);
		classroom[1].test[1].setScore("����",76);
		classroom[1].test[2].setScore("����",85);
		
		classroom[2]= new Student(3, "����");
		classroom[2].test[0].setScore("����",85);
		classroom[2].test[1].setScore("����",79);
		classroom[2].test[2].setScore("����",79);
		
		classroom[3]= new Student(4, "����");
		classroom[3].test[0].setScore("����",85);
		classroom[3].test[1].setScore("����",79);
		classroom[3].test[2].setScore("����",79);
		
		classroom[4]= new Student(5, "����");
		classroom[4].test[0].setScore("����",85);
		classroom[4].test[1].setScore("����",79);
		classroom[4].test[2].setScore("����",79);
		
	}
}
