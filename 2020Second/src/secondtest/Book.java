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
		System.out.println("저자명: " + author + "책 이름: " + bookName
				+ "출판년도: " + printYear);
	}
	public boolean searchAuthor(String name) {
		if(author == name) {
			System.out.printf("저자가 쓴 책%s 있습니다.", bookName);
			return true;
		}
		else {
			return false;
		}
	
	}
}
