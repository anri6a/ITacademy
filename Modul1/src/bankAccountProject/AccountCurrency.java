package bankAccountProject;

public class AccountCurrency extends AccountEntity {
	private double exchangeRate;
	private double currency;

	Double convert() {

		return currency;
	}

	Double currencyWithdraw() {
		return accountBalance;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
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
