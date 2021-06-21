package Test;

public class CardTest2 {
	public static void main(String[] args) {
		BaewhaCard bwcard = new BaewhaCard(1000);
		Member[] member = new Member[3];
		member[0] = new Member("bt12489-b05","tomas");
		member[1] = new Member("bt12489-b05","james");
		member[2] = new Member("bt12489-b05","linda");
		member[0]=useCard(bwcard, 5000);
		member[1]=useCard(bwcard, 2700);
		member[2]=useCard(bwcard, 6790);
		member[0]=useCard(bwcard, 12000);
		
		for(Member mimi : member) {
			bwcard.provideCuppon(mimi);
			mimi.showInfo();
		}
		bwcard.showInfo();
	}
}
