package lab_08_01;

public class Employee {

    private String typeEmployee;
    private int salaryEmployee;

    public Employee() {
    }

    public Employee(String typeEmployee, int salaryEmployee) {
        this.typeEmployee = typeEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    public int getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String salary() {
        return "Salary of employee = " + this.salaryEmployee;
    }

}
