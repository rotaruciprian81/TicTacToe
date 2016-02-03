/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Ciprian Rotaru
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tools extends JPanel {

private JButton Exit, Reset;
private Board Brd;

Tools() {

    setLayout(new FlowLayout());
    //adding buttons and functions to those buttons
    Exit = new JButton("Exit");
    Reset = new JButton("Reset");

    Exit.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    });

    Reset.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent ae) {

            Brd.Reset();

        }

    });

    add(Exit);
    add(Reset);
}

public void SetObject(Board B) {

    Brd = B;

}

}

