package secondtest;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[10];
		library[0] = new Book("�ھ�����", "�̻�", 1200);
		library[1] = new Book("���", "�踸��", 1350);
		library[2] = new Book("���η�", "�ִ����̽�", 1200);
		library[3] = new Book("���ַ�", "��Ű�ƺ���", 1200);
		library[4] = new Book("���", "����", 1200);
		library[5] = new Book("��Űȣ��", "�������׽�", 1200);
		library[6] = new Book("�������̻��", "Ȳ����", 1200);
		library[7] = new Book("�Ҿ���� �ð��� ã�Ƽ�", "���ν�Ʈ", 1200);
		library[8] = new Book("�˿͹�", "������۽�Ű", 1200);
		library[9] = new Book("���ο���", "���� �����", 1200);

		for(Book book: library) {
			book.show_Info();
		}
		String str = "Ȳ����";
		for(Book book: library) {
			if(book.searchAuthor(str)==false)
				continue;
		}
		
	}

}
