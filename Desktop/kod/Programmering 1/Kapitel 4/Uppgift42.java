/*
Program som ska beräkna om det är mer värt att köpa årskort eller biljetter till ett gym.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift42{
	public static void main(String[] args) {
        
        int visitsPerYear, annualPayment, perVisitPayment;
        
        perVisitPayment = 50;
        annualPayment = 2500;
        
        visitsPerYear = Integer.parseInt(JOptionPane.showInputDialog(null, "How many times do you visit the gym in a year?"));
            
            if(perVisitPayment * visitsPerYear >= 2500) {
               
                JOptionPane.showMessageDialog(null, "You should get the Annual gym card. ");
            } else {
                
              JOptionPane.showMessageDialog(null, "You should pay the entrance fee at every occasion.");  
            }     
    }
}