# TicTacToe
Java TicTacToe game with two players

The game has been developed using GridLayout to draw the 9 layout of the bard. The class Control is the main controller of the game and combines different components. The Board class is used to set the two players and also the grid and the buttons are build. The action of the buttons pressed is also build in this class. After a button is pressed the value is sent to the GameArray class. Automatically is switching to the second player if the last player was the first one. In the setText method are assigned the X and 0 to each player.
	In the GameArray class the data sent by ActionListener from the Board class is received and allocated to the array. The array indexes are containing a marker. In this class the array and the marker are processed and the winner is announced based on the buttons pressed and the game schema. In Tools class are assigned the Exit and Restart buttons and also their functions. Exit will be used to exit the game, and Reset to reset it from the beginning.