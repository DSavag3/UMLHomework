package demo;

public class Employee {
    private HireDate hireDate;

    public Employee(HireDate hireDate) {
        this.hireDate = hireDate;
    }
    //    public Employee() {
//        hireDate  = new HireDate("1", "09", "1987");
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                '}';
    }
}
