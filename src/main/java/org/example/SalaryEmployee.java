package org.example;

public class SalaryEmployee extends Employee{

    public int salary;

    public SalaryEmployee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public SalaryEmployee(String name) {
        super(name);
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
