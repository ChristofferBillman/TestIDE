/*
Program som ska beräkna vilket betyg man fick på ett matteprov.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift43{
	public static void main(String[] args) {

        int testScore;
            
            testScore = Integer.parseInt(JOptionPane.showInputDialog(null, "How did you score on the test? Enter your score below."));
        
        if(testScore < 25) {
            
            JOptionPane.showMessageDialog(null, "You didn't pass the test, your grade is F.");}
        
            else if (testScore >=25 && testScore <30) {
            
              JOptionPane.showMessageDialog(null, "You passed the test, your grade is E."); }
            
            else if (testScore >= 30 && testScore <35){
                
              JOptionPane.showMessageDialog(null, "You passed the test, your grade is D.");}
        
            else if (testScore >=35 && testScore <40){
                
              JOptionPane.showMessageDialog(null, "You passed the test, your grade is C.");}
                  
            else if (testScore >=40 && testScore <45){
                     
              JOptionPane.showMessageDialog(null, "You passed the test, your grade is B.");}
                
                else if (testScore >=45){
                    
                    JOptionPane.showMessageDialog(null, "You passed the test, your grade is A.");}
                }
                    
                  }
              
            
        
        
            
            