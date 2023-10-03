package org.example;

public class Entreprenuer extends Person implements IPayable{

    private double revenue, expenses;

    public Entreprenuer(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
    }

    public Entreprenuer(String name) {
        super(name);
    }


    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Entreprenuer{" +
                "name='" + getName() + '\'' +
                '}';
    }

    @Override
    public double calculatePay() {
        return revenue - expenses;
    }
}
