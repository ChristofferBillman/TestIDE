/*
Christoffer Billman
2017-11-06
Detta är en utvecklad version av det första programmet; den föredragna versionen.
 */

import javax.swing.*;
public class MainVersion {
    public static void main(String[] args) {

        int r = (int)Math.ceil(Math.random() *100);
        int g = 0;
        int n = 0;

        while (g != r) {
            g = Integer.parseInt(JOptionPane.showInputDialog("Try your luck; guess a whole number between 1 - 100."));
        if (g == r) {
            n++;
            break;
        } else if(g < r) {
            JOptionPane.showMessageDialog(null,"Your guess was wrong! (hint: the number was larger than your guess.)");
            n++;
        } else {
            JOptionPane.showMessageDialog(null, "Your guess was wrong! (hint: the number was smaller than your guess");
            n++;
    }
}           JOptionPane.showMessageDialog(null, "You were right! Your guess corresponds to the number that was generated. It took " + n + " guesses to get it right.");
}
}
