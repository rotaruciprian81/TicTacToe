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
import javax.swing.*;

public class GameArray {

/*

Class for Array

*/

private Board Brd;
private int GameArr[][];
private boolean Turn;
private JButton Pressed;

GameArray(Board B) {

    GameArr = new int[3][3];

    Brd = B;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            GameArr[i][j] = 0;
        }
    }

}

public void ArrayInitialize(int i, int j, int Marker) {

    //Set Data sent by Action listener in Board

    GameArr[i][j] = Marker;
    WinCheck(Marker);
}


public void WinCheck(int Marker) {

    // if the specified array indexs contain a certain Maker (1,2) on winning paterns then announce winner

    if ((GameArr[0][0] == Marker && GameArr[0][1] == Marker && GameArr[0][2] == Marker) || (GameArr[1][0] == Marker && GameArr[1][1] == Marker && GameArr[1][2] == Marker) || (GameArr[2][0] == Marker && GameArr[2][1] == Marker && GameArr[2][2] == Marker)) {

        if (Marker == 1) {

            JOptionPane.showMessageDialog(Brd, "CONGRATULATIONS : Player 1 (Winner)");

        } else if (Marker == 2) {

            JOptionPane.showMessageDialog(Brd, "CONGRATULATIONS : Player 2 (Winner)");

        }

        Brd.DisableAll(false);

    } else if ((GameArr[0][0] == Marker && GameArr[1][0] == Marker && GameArr[2][0] == Marker) || (GameArr[0][1] == Marker && GameArr[1][1] == Marker && GameArr[2][1] == Marker) || (GameArr[0][2] == Marker && GameArr[1][2] == Marker && GameArr[2][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "CONGRATULATIONS : Player 1 (Winner)");

        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "CONGRATULATIONS : Player 2 (Winner)");

        }

        Brd.DisableAll(false);

    } else if ((GameArr[0][0] == Marker && GameArr[1][1] == Marker && GameArr[2][2] == Marker) || (GameArr[2][0] == Marker && GameArr[1][1] == Marker && GameArr[0][2] == Marker)) {

        if (Marker == 1) {
            JOptionPane.showMessageDialog(Brd, "CONGRATULATIONS : Player 1 (Winner)");

        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(Brd, "CONGRATULATIONS : Player 2 (Winner)");

        }
        Brd.DisableAll(false);

    }

}

}
