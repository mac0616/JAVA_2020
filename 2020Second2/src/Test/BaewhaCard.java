package Test;

public class BaewhaCard {
	private int memberCount;  //ÀüÃ¼ °í°´ »ç¿ë È½¼ö
	private int income;
	int cupponCount;
	
	public BaewhaCard(int memberCount) {
		super();
		this.memberCount = memberCount;
	}

	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	public int useMoney(int pay) {
		setMemberCount(getMemberCount()+1);
		return (int)(pay * 0.02);
	}
	
	public void provideCuppon(Member human) {
		if(human.money >=10000 && human.cuppon==false)
			human.cuppon = true;
			cupponCount++;
	}
}
