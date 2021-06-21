package Test;

public class TestStudent {

	public static void main(String[] args) {
		BaewhaStudent lee = new BaewhaStudent("이미진","정보보호과", "서울시 종로구 필운동",58.5,1.75);
		BaewhaStudent kim = new BaewhaStudent("김미진","정보보호과", "서울시 서초구 반포동",76,1.78);
		BaewhaStudent park = new BaewhaStudent("박미진","정보보호과", "서울시 구로동",45.2,1.54);
		lee.setheight(-12.5);
		lee.show_Information();
		kim.show_Information();
		park.show_Information();

	}

}
