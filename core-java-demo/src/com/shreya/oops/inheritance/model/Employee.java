package src.com.shreya.oops.inheritance.model;

public class Employee extends Person{
    private int empid;
    private String dept;
    private int salary;

    public Employee(String alice) {
        super(alice);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
