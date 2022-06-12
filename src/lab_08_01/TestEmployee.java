package lab_08_01;

import java.util.Arrays;

public class TestEmployee {

    public static void main(String[] args) {
        Employee contractEmployee = new ContractEmployee();
        Employee fullTimeEmployee = new FullTimeEmployee();

        EmployeeController controller = new EmployeeController();
        int totalSalary = controller.salaryCalculator(Arrays.asList(contractEmployee, fullTimeEmployee));

        System.out.println("Salary of contract employee = " + contractEmployee.getSalaryEmployee());
        System.out.println("Salary of full time employee = " + fullTimeEmployee.getSalaryEmployee());
        System.out.println("Salary of all employees = " + totalSalary);
    }
}
