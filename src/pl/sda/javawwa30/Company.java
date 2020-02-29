package pl.sda.javawwa30;

public class Company {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void printOperations() {
        int monthlyOps = 0;
        int annualOps = 0;

        for(Employee e : employees) {
            if(e != null) {
                monthlyOps += e.getSalary();
                annualOps += e.getAnnualSalary();
            }
        }

        System.out.println("Monthly operations: $" + monthlyOps +
                "\nAnnual operations: $" + annualOps);
    }

    public void employ(Employee e) {
        int idx = -1;

        for(int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {    //nie ma wolnego miejsca w tablicy
            Employee[] modEmployees = new Employee[2 * employees.length];
            for(int i = 0; i < employees.length; i++) {
                modEmployees[i] = employees[i];
            }
            modEmployees[employees.length] = e;
            employees = modEmployees;
            System.out.println("Dokupilismy biurek dla pracownikow, teraz jest: " + modEmployees.length);
        }
        else {  //jest wolne miejsce w tabeli na pozycji idx
            employees[idx] = e;
        }
    }

}
