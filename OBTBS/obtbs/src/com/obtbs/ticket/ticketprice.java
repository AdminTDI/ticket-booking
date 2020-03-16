/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obtbs.ticket;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Syawal Sauffi
 */
public class ticketprice extends JFrame {

    private JPanel panel;

    public ticketprice() {
        super("Your Ticket Price");
        panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
    }
}
