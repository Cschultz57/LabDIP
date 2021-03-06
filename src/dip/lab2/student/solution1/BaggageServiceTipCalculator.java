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
public class BaggageServiceTipCalculator implements TipCalculator {

    private static double MIN_BILL = 0.00;
    private static double MAX_BILL = 100.00;
    private static String BILL_ENTRY_ERR
            = "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;

    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q);
        this.setBagCount(bags);

        baseTipPerBag = 1.00;
    }

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }
}
