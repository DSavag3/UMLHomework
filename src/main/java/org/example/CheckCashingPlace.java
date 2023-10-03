package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CheckCashingPlace {

    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Shyco", 17.0, 20.0 );
   Entreprenuer entreprenuer = new Entreprenuer("Dev", 2000.0, 100.0);
   SalaryEmployee salaryEmployee = new SalaryEmployee("Ziah", 50000);
   HumanResources.printBadge(hourlyEmployee);
        System.out.println(hourlyEmployee.calculatePay());
        System.out.println(entreprenuer);
        System.out.println(entreprenuer.calculatePay());
        HumanResources.printBadge(salaryEmployee);
        System.out.println(salaryEmployee.calculatePay());


    }
}