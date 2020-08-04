package em.java_.generecite_bank;

public class Account <T>{
	private String owner;
	private double amount;
	private T currency;
	
	public Account(String owner, double amount, T currency) {
		this.owner=owner;
		this.amount=amount;
		this.currency=currency;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public T getCurrency() {
		return this.currency;
	}

	public void addMoney(int amount) {
		this.amount+=amount;
	}
	
	public void removeMoney(int amount) {
		this.amount-=amount;
	}
	
	public void showBalance() {
		System.out.println(this.owner + " a " + amount + " " + currency + " sur votre compte");
	}
}
