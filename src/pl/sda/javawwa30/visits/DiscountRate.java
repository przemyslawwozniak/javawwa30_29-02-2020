package pl.sda.javawwa30.visits;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.2;
    private static double serviceDiscountSilver = 0.2;

    public static double getServiceDiscountRate(String membership) {
        switch(membership.toUpperCase()) {  //wszystkie litery 'membership' sa drukowane
            case "PREMIUM":
                return serviceDiscountPremium;
            case "GOLD":    //gld
                return serviceDiscountGold;
            case "SILVER":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

}
