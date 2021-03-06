/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Carson Schultz
 */
public class FoodServiceTipCalculator implements TipCalculator {

    private static double MIN_BILL = 0.00;
    private static String BILL_ENTRY_ERR
            = "Error: bill must be greater than or equal to " + MIN_BILL;
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;
    private ServiceQuality serviceQuality;
    private double bill;

    public FoodServiceTipCalculator(ServiceQuality q, double bill) {
        this.setServiceRating(q);
        this.setBill(bill);
    }

    public final void setBill(double billAmt) {
        if (billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public double getBill() {
        return bill;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }
}
