package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public abstract class Fruits {
	public String name;

    public Fruits(String name) {// une class abstraite peut avoir un Ctor, or une interface ne peut pas
        this.name = name;
    }

    public abstract void taste();

    public abstract int getSize();

    public abstract boolean hasSeed();

    public void miam() {
        System.out.println("Les " + getName() + " sont bien en general.");
    }

    public String getName() {
        return name;
    }

}
