package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public class Apple extends Fruits {

	public Apple(String name) {
		super(name);
	}

	@Override
	public void taste() {
		System.out.println("le gout de " + super.getName() + " est sucre");
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

}
