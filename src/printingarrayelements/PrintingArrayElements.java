/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingarrayelements;

/**
 *
 * @author ericgreise
 */
public class PrintingArrayElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] cellBills = new double [7];
        
        cellBills[0] = 45.26;
        cellBills[1] = 54.67;
        cellBills[2] = 42.56;
        cellBills[3] = 44.61;
        cellBills[4] = 65.29;
        cellBills[5] = 49.75;
        cellBills[6] = 32.76;
        
        System.out.println("Element\tValue");
        
        for (int i =0; i < cellBills.length; i++) {
            System.out.println(i + "\t" + cellBills[1]);
        }
    }
    
}
