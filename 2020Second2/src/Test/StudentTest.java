package Test;

public class StudentTest {

	public static void main(String[] args) {
		Student[] StudentInfo = new Student[5];
		StudentInfo[0] = new Student("A1234","홍길동","010-8564-7530");
		StudentInfo[1] = new Student("B9856","이길동","010-2485-5168");
		StudentInfo[2] = new Student("C7536","김길동","010-9876-324[p8");
		StudentInfo[3] = new Student("D1235","박길동","010-5432-1234");
		StudentInfo[4] = new Student("E8520","최길동","010-7410-6789");
		
		for(Student student: StudentInfo) {
			student.show_Info();
		}
		String str="E8520";
		for(Student student : StudentInfo) {
			if(student.searchstudentnum(str)==false)
				continue;
		}

	}

}
