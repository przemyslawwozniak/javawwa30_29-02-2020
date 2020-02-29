package pl.sda.javawwa30.visits;

public class Customer {

    private String name, membership;

    public Customer(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getMembership() {
        return membership;
    }

    public String getName() {
        return name;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

}
