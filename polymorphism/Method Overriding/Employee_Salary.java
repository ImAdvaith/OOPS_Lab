class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void printDetails() {
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus; // Manager gets base salary + bonus
    }
}

class Developer extends Employee {
    private int numberOfProjects;

    public Developer(double baseSalary, int numberOfProjects) {
        super(baseSalary);
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (numberOfProjects * 500); // Developer gets bonus per project
    }
}

public class Company {
    public static void main(String[] args) {
        Employee manager = new Manager(5000, 1500); 
        Employee developer = new Developer(4000, 5); 

        System.out.println("Manager Details:");
        manager.printDetails();  

        System.out.println("\nDeveloper Details:");
        developer.printDetails();  
    }
}
