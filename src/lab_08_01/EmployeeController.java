package lab_08_01;

import java.util.List;

public class EmployeeController {

    public int salaryCalculator(List<Employee> employeeList) {
        int totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary += employee.getSalaryEmployee();
        }

        return totalSalary;
    }
}
