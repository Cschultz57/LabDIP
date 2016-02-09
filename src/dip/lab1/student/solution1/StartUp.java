/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Carson Schultz
 */
public class StartUp {

    public static void main(String[] args) {

        HourlyEmployee emp1 = new HourlyEmployee(11.50, 2020);
        SalaryEmployee emp2 = new SalaryEmployee(115000, 1250);

        HRService hr = new HRService();

        System.out.println("Employee 1 annual wage: " + hr.getEmployeesWages(emp1));
        System.out.println("Employee 2 annual wage: " + hr.getEmployeesWages(emp2));

    }
}
