/*
Christoffer Billman
2017-11-06
Första programmet; test.
 */

import javax.swing.*;
public class TestIDE {
    public static void main(String[] args) {
        int g = Integer.parseInt(JOptionPane.showInputDialog("Try your luck; guess what whole number between 1 - 100 will appear."));
        int r = (int)Math.ceil(Math.random() *100);
                if (g == r) {
                    JOptionPane.showMessageDialog(null, "You were right! Your guess corresponds to the number that was generated.");
                } else {
                    JOptionPane.showMessageDialog(null, "You were wrong :(! The number that was generated was " + r);
                }
    }
}
