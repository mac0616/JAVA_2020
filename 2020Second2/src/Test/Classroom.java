package Test;

public class Classroom {
	public static void main(String[] args) {
		Student[] classroom = new Student[5];
		classroom[0]= new Student(1, "공유");
		classroom[0].test[0].setScore("영어",92);
		classroom[0].test[1].setScore("수학",65);
		classroom[0].test[2].setScore("국어",60);
		
		classroom[1]= new Student(2, "미진");
		classroom[1].test[0].setScore("영어",75);
		classroom[1].test[1].setScore("수학",76);
		classroom[1].test[2].setScore("국어",85);
		
		classroom[2]= new Student(3, "수미");
		classroom[2].test[0].setScore("영어",85);
		classroom[2].test[1].setScore("수학",79);
		classroom[2].test[2].setScore("국어",79);
		
		classroom[3]= new Student(4, "영수");
		classroom[3].test[0].setScore("영어",85);
		classroom[3].test[1].setScore("수학",79);
		classroom[3].test[2].setScore("국어",79);
		
		classroom[4]= new Student(5, "국수");
		classroom[4].test[0].setScore("영어",85);
		classroom[4].test[1].setScore("수학",79);
		classroom[4].test[2].setScore("국어",79);
		
	}
}
