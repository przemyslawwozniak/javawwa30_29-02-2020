package pl.sda.javawwa30;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Andrzej", "Bokser", 12500);
        Employee e2 = new Employee(1, "Roman", "Smieszek", 1222);
        Employee e3 = new Employee(1, "Juriji", "Kovalwe", 2165);
        System.out.println(e1);
        System.out.println("Annual salary: " + e1.getAnnualSalary());
        e1.raiseSalary(9);
        System.out.println(e1);
        System.out.println("Annual salary: " + e1.getAnnualSalary());

        //test income tax calc
        IncomeTaxCalc.printIncomeTaxFor(41234);
        IncomeTaxCalc.printIncomeTaxFor(67891);
        IncomeTaxCalc.printIncomeTaxFor(85432);
        IncomeTaxCalc.printIncomeTaxFor(12345);

        Employee[] emps = {e1, e2};
        Company comp = new Company(emps);
        comp.printOperations();
        comp.employ(e3);
        comp.printOperations();
    }

}
