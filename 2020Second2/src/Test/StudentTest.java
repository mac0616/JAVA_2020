package Test;

public class StudentTest {

	public static void main(String[] args) {
		Student[] StudentInfo = new Student[5];
		StudentInfo[0] = new Student("A1234","ȫ�浿","010-8564-7530");
		StudentInfo[1] = new Student("B9856","�̱浿","010-2485-5168");
		StudentInfo[2] = new Student("C7536","��浿","010-9876-324[p8");
		StudentInfo[3] = new Student("D1235","�ڱ浿","010-5432-1234");
		StudentInfo[4] = new Student("E8520","�ֱ浿","010-7410-6789");
		
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
