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
public class HourlyEmployee implements Employee {

    private double hourlyWage;
    private double totalHours;

    public HourlyEmployee(double hourlyWage, double totalHours) {
        setHourlyWage(hourlyWage);
        setTotalHours(totalHours);
    }

    public final double getHourlyWage() {
        return hourlyWage;
    }

    public final void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public final double getTotalHours() {
        return totalHours;
    }

    public final void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public double getAnnualWages() {
        return hourlyWage * totalHours;
    }

}
