package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public class NoMoneyException extends Exception {
	public NoMoneyException() {
		super("Attention la balance ne doit pas etre négative");
	}

}
