package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public class Strawberry extends Fruits {

	public Strawberry() {
        super("fraises");
    }

    @Override
    public void taste() {
        System.out.println("la fraise est sucre");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

}
