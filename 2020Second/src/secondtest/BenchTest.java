package secondtest;

public class BenchTest {

	public static void main(String[] args) {
		int num=1253;
		int bench=0;
		bench=1253/6;
		
		if(1253%6>0)
			bench++;
		System.out.println("총 학생수는 " + num + "명이고 벤치 개수는 " + bench + "개가 필요합니다");

	}

}
