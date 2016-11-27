package bankAccountProject;

public class Card extends Individual {
	public enum CardType {
		GOLD, SILVER, REGULAR
	}

	private double discountGold=10;
	private double discountSilver=5;
	private double discountRegular=1;
	private double moneyToWithdraw;
	private double moneyToPayCard;

	double withdraw() {
		accountBalance = accountBalance - moneyToWithdraw;
		return accountBalance;
	}

	double payCard() {
		//accountBalance = accountBalance * cardType;

		return accountBalance;
	}

	public double getDiscountGold() {
		return discountGold;
	}

	public void setDiscountGold(double discountGold) {
		this.discountGold = discountGold;
	}

	public double getDiscountSilver() {
		return discountSilver;
	}

	public void setDiscountSilver(double discountSilver) {
		this.discountSilver = discountSilver;
	}

	public double getDiscountRegular() {
		return discountRegular;
	}

	public void setDiscountRegular(double discountRegular) {
		this.discountRegular = discountRegular;
	}

	public double getMoneyToWithdraw() {
		return moneyToWithdraw;
	}

	public void setMoneyToWithdraw(double moneyToWithdraw) {
		this.moneyToWithdraw = moneyToWithdraw;
	}

	public double getMoneyToPayCard() {
		return moneyToPayCard;
	}

	public void setMoneyToPayCard(double moneyToPayCard) {
		this.moneyToPayCard = moneyToPayCard;
	}

	@Override
	public void block() {
		// TODO Auto-generated method stub

	}

	@Override
	public void unBlock() {
		// TODO Auto-generated method stub

	}

}
