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
		System.out.println("���̵�: " + cardId + "��ȭī��� ��" + name + 
				"���� ���ݾ��� " + money + "���̰� ����Ʈ�� " + point);
	}
	//System.out.println("���̵�: " + cardId + "��ȭī��� ��" + getName() + "���� ���ݾ��� " + money + "���̰� ����Ʈ�� " + point);
}
