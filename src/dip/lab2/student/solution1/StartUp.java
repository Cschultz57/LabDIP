
package dip.lab2.student.solution1;

/**
 *
 * @author Carson Schultz
 */
public class StartUp {
   
 
    public static void main(String[] args) {
        FoodServiceTipCalculator sc = new FoodServiceTipCalculator(ServiceQuality.GOOD,110);
        BaggageServiceTipCalculator b = new BaggageServiceTipCalculator(ServiceQuality.FAIR,2);
        
        TipService tc = new TipService();
        
        System.out.println("The tip for food service is: "+ tc.getTip(sc)+" dollars.");
        System.out.println("The tip for baggage service is: "+tc.getTip(b)+" dollars.");
        
    }

}
