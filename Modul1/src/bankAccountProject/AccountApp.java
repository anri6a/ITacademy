package bankAccountProject;

//import bankAccountProject.AccountCard.CardType;

public class Main {

	public static void main(String[] args) {
		
		Card accCard=new Card();
		//CardType cardType =CardType.GOLD;
		accCard.setMoneyToWithdraw(100);
		System.out.println(accCard.withdraw());

	}

}
