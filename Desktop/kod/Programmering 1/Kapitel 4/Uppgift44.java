/*
Program som ska berätta om ett paket/brev är tillåtet eller inte.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift44{
	public static void main(String[] args){ 
        
        int length, width, heigth;
        
            length = Integer.parseInt(JOptionPane.showInputDialog("What is the length of your parcel/letter? (mm)"));
            width = Integer.parseInt(JOptionPane.showInputDialog("What is the width of your parcel/letter? (mm)"));
            heigth = Integer.parseInt(JOptionPane.showInputDialog("What is the heigth of your parcel/letter? (mm)"));
            
            if (length >=140 && length <=600 && width >90 && heigth <100 && length + width + heigth <= 900){
        
            JOptionPane.showMessageDialog(null, "Your parcel/letter is allowed.");
            } else {
                
               JOptionPane.showMessageDialog(null, "Your parcel/letter is not allowed."); 
            }
        }}