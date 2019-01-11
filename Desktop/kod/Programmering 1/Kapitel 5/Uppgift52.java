/*
Program som ska berätta om ett paket/brev är tillåtet eller inte.

Christoffer Billman

2017-09-25
*/

import javax.swing.*;

public class Uppgift52{
	public static void main(String[] args){
    
    double n, i, summa;
        summa = 0;
        i = 0;
        n = 0;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("n?"));
        while(i <= n){
            
            summa = summa = 1/n; 
            i = i + 1; 
           
        }
         JOptionPane.showMessageDialog(null, "Summan är: " + summa);
       
    }
}