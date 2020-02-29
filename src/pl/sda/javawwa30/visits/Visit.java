package pl.sda.javawwa30.visits;

import java.time.LocalDateTime;

public class Visit {

    private Customer customer;
    private LocalDateTime dateTime;
    private double serviceExpense, productExpense;

    public Visit(Customer customer, LocalDateTime dateTime) {
        this.customer = customer;
        this.dateTime = dateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    double getTotalExpense() {
        double discountedServiceExpense = serviceExpense * (1 - DiscountRate.getServiceDiscountRate(customer.getMembership()));
        double discountedProductExpense = productExpense * (1 - DiscountRate.getProductDiscountRate(customer.getMembership()));
        return discountedProductExpense + discountedServiceExpense;
    }

    @Override
    public String toString() {
        return customer.getName() + " @ " + dateTime + "\n" +
                "Raw services expense = " + serviceExpense + "\n" +
                "Raw products expense = " + productExpense + "\n" +
                "Total charge = " + getTotalExpense();
    }

}
