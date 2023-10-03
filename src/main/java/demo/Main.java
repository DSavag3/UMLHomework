package demo;

public class Main {
    public static void main(String[] args) {

HireDate hireDate1 = new HireDate("Monday", "January","2003");
HireDate hiredate2 = new HireDate("Wednesday", "April", "2021");
        Employee employee = new Employee(hireDate1);
Employee employee2 = new Employee(hiredate2);

        System.out.println(employee);
        System.out.println();
       // System.out.println(hireDate1);
        System.out.println(employee2);
    }
}
