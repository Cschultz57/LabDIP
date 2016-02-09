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
public class StartUp {
   
 
    public static void main(String[] args) {
        FoodServiceTipCalculator sc = new FoodServiceTipCalculator(ServiceQuality.GOOD,110);
        BaggageServiceTipCalculator b = new BaggageServiceTipCalculator(ServiceQuality.FAIR,2);
        
        TipCalculator tc = new TipCalculator();
        
        System.out.println("The tip for food service is: "+ tc.getTip(sc)+" dollars.");
        System.out.println("The tip for baggage service is: "+tc.getTip(b)+" dollars.");
        
    }

}
