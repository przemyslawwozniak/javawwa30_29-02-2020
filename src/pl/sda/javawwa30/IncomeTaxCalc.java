package pl.sda.javawwa30;

public class IncomeTaxCalc {

    private static final double TAX_RATE_ABOVE_20K = 0.1;
    private static final double TAX_RATE_ABOVE_40K = 0.2;
    private static final double TAX_RATE_ABOVE_60K = 0.3;

    public static int calcIncomeTax(int annualSalary) {
        if (annualSalary <= 20000) {         // [0, 20000]
            return 0;
        } else if (annualSalary <= 40000) {  // [20001, 40000]
            return (int)((annualSalary - 20000) * TAX_RATE_ABOVE_20K); //10%
        } else if (annualSalary <= 60000) {  // [40001, 60000]
            return (int)(20000 * TAX_RATE_ABOVE_20K) +
                    (int)((annualSalary - 40000) * TAX_RATE_ABOVE_40K); //20%
        } else {                              // [60001, ]
            return (int)(20000 * TAX_RATE_ABOVE_20K) +
                    (int)(20000 * TAX_RATE_ABOVE_40K) +
                    (int)((annualSalary - 60000) * TAX_RATE_ABOVE_60K);
        }
    }

    /*
    Enter the taxable income: $41234
    The income tax payable is: $2246.80
     */
    public static void printIncomeTaxFor(int annualSalary) {
        System.out.println("Your annual income: $" + annualSalary);
        System.out.println("The income tax payable is: $" + calcIncomeTax(annualSalary));
    }

}
