package com.code;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {


    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
    
}