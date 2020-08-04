package em.java_.generecite_bank;

public class Bank {
	
	private String name;
	
	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	//	ds le main myAccount est de type Character et otherAccount est de type String.
	//	la meth transfert fonctionne uniquement de myAccount<Character> vers otherAccount<String>. Pr permettre le transfert ds le 2 sens,
	//	on doit faire une meth generique qui prend les compte qlq soit leur type

	public <T, S> S transfert(Account<T> sourceAccount, Account<S> targetAccount, int amount) {
		if (sourceAccount.getAmount() >= amount) {
			sourceAccount.removeMoney(amount);
			targetAccount.addMoney(amount);
			System.out.println(sourceAccount.getOwner() + " a envoyé " + amount + " " + sourceAccount.getCurrency() + " a " + targetAccount.getOwner());
		}
		else {
			System.err.println("Operation impossible ! Le compte de " + sourceAccount.getOwner() + " n'est pas fourni");
		}
		
		return targetAccount.getCurrency()	;		//le retour de la meth est de type S
	}

}
