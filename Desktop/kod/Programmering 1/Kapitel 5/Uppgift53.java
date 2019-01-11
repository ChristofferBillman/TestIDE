/*
Program som ska berätta hur många gånger en boll studstar innan den sluta göra det.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift53{
	public static void main(String[] args){
        int numOfBounce = 0;
        int height;
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Hur högt släpper du bollen ifrån? (cm)"));
        
            while(height>1){
                
                height = height * 0.7;
                numOfBounce = numOfBounce + 1;
            }
        
        JOptionPane.showMessageDialog(null, "Bollen studsar " + numOfBounce + " gånger.");
    }
}