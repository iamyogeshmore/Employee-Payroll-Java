package org.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*UC1-Create an Employee Payroll Service to Read and Write Employee Payroll to a Console
 Create Employee Payroll Class of id,name and Salary.*/

public class EmployeePayrollService {
    private List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService() {
    }

    public static void main(String[] args) {
        System.out.println("********** Welcome to Employee Payroll Service Program **********");
        Scanner input = new Scanner(System.in);
        ArrayList<EmployeePayroll> employeePayrollArrayList = new ArrayList<EmployeePayroll>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollArrayList);
        employeePayrollService.writeData(input);
        employeePayrollService.showData();
    }

    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    private void showData() {
        System.out.println("Employee data : " + employeePayrollList);
    }

    private void writeData(Scanner data) {
        System.out.print("Enter your name : ");
        String name = data.nextLine();
        System.out.print("Enter your ID : ");
        int id = data.nextInt();
        System.out.print("Enter your salary : ");
        double salary = data.nextDouble();
        EmployeePayroll empData = new EmployeePayroll(id, name, salary);
        employeePayrollList.add(empData);
    }
}