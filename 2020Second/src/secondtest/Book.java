package secondtest;

public class Book {
	String bookName;
	String author;
	int printYear;
	
	public Book() {
		super();
	}
	
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public Book(String bookName, String author, int printYear) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.printYear = printYear;
	}
	
	public void show_Info() {
		System.out.println("���ڸ�: " + author + "å �̸�: " + bookName
				+ "���ǳ⵵: " + printYear);
	}
	public boolean searchAuthor(String name) {
		if(author == name) {
			System.out.printf("���ڰ� �� å%s �ֽ��ϴ�.", bookName);
			return true;
		}
		else {
			return false;
		}
	
	}
}
