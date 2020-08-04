package em.java_.generecite_bank;

public class App {

	public static void main(String[] args) {
		Account<Character> myAccount = new Account<Character>("Graven", 300, '€');
		myAccount.showBalance();
		
		Account<String> otherAccount = new Account<String>("bob", 100, "euros");
		otherAccount.showBalance();
		
		Bank bank= new Bank("GravenBank");
		System.out.println(bank.transfert(myAccount, otherAccount, 190));	//le transfert est fait et la devise est retourné
		
		myAccount.showBalance();
		otherAccount.showBalance();
		
	}

}
