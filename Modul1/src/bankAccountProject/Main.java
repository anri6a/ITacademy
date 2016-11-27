package bankAccountProject;

//import bankAccountProject.AccountCard.CardType;

public class AccountMain {

	public static void main(String[] args) {
		
		AccountCard accCard=new AccountCard();
		//CardType cardType =CardType.GOLD;
		accCard.setMoneyToWithdraw(100);
		System.out.println(accCard.withdraw());

	}

}
