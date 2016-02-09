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
public class SalaryEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

    public SalaryEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    public final double getAnnualSalary() {
        return annualSalary;
    }

    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public final double getAnnualBonus() {
        return annualBonus;
    }

    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

}
