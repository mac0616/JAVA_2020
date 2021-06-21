package Test;

public class CardTest {

	public static void main(String[] args) {
		BaewhaCard bwcard = new BaewhaCard(1000);
		Member james = new Member("a123467-c12", "james");
		Member tomas = new Member("bt12489-b05", "tomas");
		james.useCard(bwcard, 500);
		tomas.useCard(bwcard, 2700);
		james.useCard(bwcard, 6790);
		
		bwcard.provideCuppon(james);
		bwcard.provideCuppon(tomas);
		
		james.showInfo();
		tomas.showInfo();
		
	}

}
