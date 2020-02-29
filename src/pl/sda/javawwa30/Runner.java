package pl.sda.javawwa30;

public class Runner {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "PW", 20);
        Customer c2 = new Customer(2, "LW", 15);

        System.out.println(c1);
        System.out.println(c2);

        Invoice i1 = new Invoice(1, c1, 100);
        Invoice i2 = new Invoice(2, c2, 5563.42);

        System.out.println(i1);
        System.out.println(i2);
    }

}
