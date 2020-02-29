package pl.sda.javawwa30;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Andrzej", "Bokser", 12500);
        System.out.println(e1);
        System.out.println("Annual salary: " + e1.getAnnualSalary());
        e1.raiseSalary(9);
        System.out.println(e1);
        System.out.println("Annual salary: " + e1.getAnnualSalary());
    }

}
