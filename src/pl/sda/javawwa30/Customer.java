package pl.sda.javawwa30;

public class Customer {

    private int ID;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    //metoda toString jest dziedziczona z klasy java.lang.Object
    //jezeli cos dziedziczymy, zawsze pamietaj o anotacji!
    @Override
    public String toString() {
        return String.format("[#%d] %s - -%d%%", ID, name, discount);
    }

}
