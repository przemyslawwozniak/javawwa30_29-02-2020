package pl.sda.javawwa30.visits;

public class Visit {

    private Customer customer;

    double getTotalExpense() {
        DiscountRate.getServiceDiscountRate(customer.getMembership());
    }

}
