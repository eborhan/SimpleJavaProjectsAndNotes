public class Employee {
    String name;
    int workingHours, hireYear;
    double salary;

    Employee(String name, double salary, int workingHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000)
            return 0;
        else
            return (this.salary * 0.03);
    }

    double bonus() {
        if (this.workingHours > 40)
            return ((this.workingHours - 40) * 30);
        else
            return 0;
    }

    double raiseSalary() {
        if (2021 - this.hireYear > 19)
            return (this.salary * 0.15);
        else if (9 < 2021 - this.hireYear && 2021 - this.hireYear < 20)
            return (this.salary * 0.1);
        else
            return (this.salary * 0.05);

    }

    void printMaasBilgileri() {
        System.out.println("====================");
        System.out.println("Name: " + this.name +
                "\nBase salary: " + this.salary +
                "\nWorking hours: " + this.workingHours +
                "\nYear of hire: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary raise: " + raiseSalary() +
                "\nSalary with total taxes and bonuses: " + (this.salary - tax() + bonus()) +
                "\nNet pay: " + (this.salary - tax() + bonus() + raiseSalary()));


    }
}
