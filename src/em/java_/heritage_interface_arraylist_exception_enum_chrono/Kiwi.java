package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public class Kiwi extends Fruits implements PeelFruit {

	public Kiwi() {
        super("kiwi");
    }

    @Override
    public void taste() {
        System.out.println("le kiwi est plutot sucre et doux");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return true;
    }

    public String getSkinType() {
        return "doux";
    }

}
