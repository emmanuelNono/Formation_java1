package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public class PineApple extends Fruits implements PeelFruit {

	boolean peeled = false;

    public PineApple() {
        super("ananass");
    }

    @Override
    public void taste() {
        System.out.println("le gout est acide");
    }

    @Override
    public int getSize() {
        return 10;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return peeled;
    }

    public String getSkinType() {
        return "piquante";
    }

}
