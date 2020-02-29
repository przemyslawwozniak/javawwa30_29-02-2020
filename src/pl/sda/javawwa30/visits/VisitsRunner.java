package pl.sda.javawwa30.visits;

import java.time.LocalDateTime;

public class VisitsRunner {

    public static void main(String[] args) {
        Customer c1 = new Customer("PW", "GOLD");
        Customer c2 = new Customer("LL", "dupa");
        Customer c3 = new Customer("PLK", "premium");

        Visit v1 = new Visit(c1, LocalDateTime.of(2020, 3, 2, 19, 30));
        Visit v2 = new Visit(c2, LocalDateTime.of(2020, 5, 20, 11, 30));
        Visit v3 = new Visit(c3, LocalDateTime.of(2020, 2, 29, 20, 45));

        v1.setServiceExpense(100);
        v1.setProductExpense(0);

        v2.setServiceExpense(370);
        v2.setProductExpense(150);

        v3.setServiceExpense(40);
        v3.setProductExpense(0);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }

}
