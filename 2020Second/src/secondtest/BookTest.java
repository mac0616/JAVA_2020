package secondtest;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[10];
		library[0] = new Book("박씨부인", "미상", 1200);
		library[1] = new Book("구운동", "김만중", 1350);
		library[2] = new Book("국부론", "애덤스미스", 1200);
		library[3] = new Book("군주론", "마키아벨리", 1200);
		library[4] = new Book("논어", "공자", 1200);
		library[5] = new Book("돈키호테", "세르반테스", 1200);
		library[6] = new Book("별과같이살다", "황순원", 1200);
		library[7] = new Book("잃어버린 시간을 찾아서", "프로스트", 1200);
		library[8] = new Book("죄와벌", "도스토앱스키", 1200);
		library[9] = new Book("제인에어", "샬롯 브론테", 1200);

		for(Book book: library) {
			book.show_Info();
		}
		String str = "황순원";
		for(Book book: library) {
			if(book.searchAuthor(str)==false)
				continue;
		}
		
	}

}
