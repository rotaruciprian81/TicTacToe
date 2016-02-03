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

public class Board extends JPanel implements ActionListener {

private JButton Buttons[];
private GameArray GArray; // Class with Array
private boolean Player = false;
private int PlayerMark = 1;

/*
 Player is the Current players turn. if false player 1 will play else player 2
 PlayerMark is to set number to the array "1" for player 1 and "2" for player 2
 */
Board() {

    // creates the panel
    setLayout(new GridLayout(3, 3));

    Buttons = new JButton[9];

    for (int i = 0; i < Buttons.length; i++) {
        Buttons[i] = new JButton("");
    }

    SetGame();

    for (int i = 0; i < Buttons.length; i++) {
        Buttons[i].addActionListener(this);
        add(Buttons[i]);
    }


}

public void SetGame() {

    GArray = new GameArray(this);

    DefaultText();
    DisableAll(true);

    Player = false; // default Value
    PlayerMark = 1; // default Value
}

public void Reset() {

    SetGame(); // To Reset the Game

}

public void actionPerformed(ActionEvent E) {

    JButton Pressed = (JButton) E.getSource();

    /*
     if any button is pressed the value is sent to GameArray class
     */
    if (Pressed == Buttons[0]) {
        GArray.ArrayInitialize(0, 0, PlayerMark);
        SetText(Pressed, Player);     // change button text to "X" or "O" based on player turn
        PlayerMark = SwithTurn(Player); // Swithch Turns
        ButtonDisabler(Buttons[0]); // Disable pressed Button

    } else if (Pressed == Buttons[1]) {
        GArray.ArrayInitialize(0, 1, PlayerMark);
        SetText(Pressed, Player);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[1]);
    } else if (Pressed == Buttons[2]) {
        GArray.ArrayInitialize(0, 2, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[2]);

    } else if (Pressed == Buttons[3]) {
        GArray.ArrayInitialize(1, 0, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[3]);

    } else if (Pressed == Buttons[4]) {
        GArray.ArrayInitialize(1, 1, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[4]);

    } else if (Pressed == Buttons[5]) {
        GArray.ArrayInitialize(1, 2, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[5]);
    } else if (Pressed == Buttons[6]) {
        GArray.ArrayInitialize(2, 0, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[6]);
    } else if (Pressed == Buttons[7]) {
        GArray.ArrayInitialize(2, 1, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[7]);
    } else if (Pressed == Buttons[8]) {
        GArray.ArrayInitialize(2, 2, PlayerMark);
        SetText(Pressed, Player);
        PlayerMark = SwithTurn(Player);
        ButtonDisabler(Buttons[8]);
    }

}

public int SwithTurn(boolean last) {

    // if the past player was false(player 1) then switch to true(player 2)

    if (last == true) {
        Player = false;
        return 1;

    } else if (last == false) {
        Player = true;
        return 2;
    } else {
        return 3;
    }

}

public void ButtonDisabler(JButton Btn) {

    Btn.setEnabled(false); // Disable Button

}

public void DisableAll(boolean Opp) {

            // Disable  All Buttons
    for (int i = 0; i < Buttons.length; i++) {
        Buttons[i].setEnabled(Opp);
    }

}

public void SetText(JButton Btn, boolean Play) {

    if (Play == true) {
        Btn.setText("O");
    } else if (Play == false) {
        Btn.setText("X");
    }

}

public void DefaultText() {

    for (int i = 0; i < Buttons.length; i++) {
        Buttons[i].setText("");
    }
}

    

}
