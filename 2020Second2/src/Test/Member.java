package Test;
public class Member {
	private String cardId;
	private String name;
	int money;
	int point;
	boolean cuppon=false;

	
	public Member(String cardId, String name) {
		super();
		this.cardId = cardId;
		this.name = name;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void useCard(BaewhaCard card, int pay) {
		money += pay;
		point += card.useMoney(pay);
	}

	public void showInfo() {
		System.out.println("아이디: " + cardId + "배화카드사 고객" + name + 
				"님의 사용금액은 " + money + "원이고 포인트는 " + point);
	}
	//System.out.println("아이디: " + cardId + "배화카드사 고객" + getName() + "님의 사용금액은 " + money + "원이고 포인트는 " + point);
}
