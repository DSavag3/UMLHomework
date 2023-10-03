package org.example;

public class HourlyEmployee extends Employee {

    public double hourlyRate, hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name) {
        super(name);
    }


    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

