package FelixWilkingVincentTran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int boardlength = 10; //Initialize variable for board dimensions
        int difficulty = 50; //Set the variable for changing the density of planets in the array
        double randomX = 0; //Random number generator for X coordinate
        double randomY = 0; //Random number generator for Y coordinate
        int x = 0; //X coordinate
        int y = 0; //Y coordinate

        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength]; //Sets the board x and y length

        //Fills the board with planets at random spots
        for(int i = 0; i < difficulty; i++) {
            randomX = Math.random() * boardlength;
            randomY = Math.random() * boardlength;
            boardarray[(int) (randomX)][(int) (randomY)] = new planet(3);
        }

        for (int j = 0; j < boardlength; j++)
        {
            if (boardarray[x][j] == null) {
                boardarray[x][j] = new Space(" ", x, j);
            }

            if (j+1 == boardlength)
            {
             x += 1;
             j = -1;
            }

            if (x == boardlength)
            {
                j = boardlength;
            }
        }

        playerclass player1 = new playerclass("Jaune", 0, 0); //Initialize the player's name, and x and y coordinates
        boardarray[player1.xLoc][player1.yLoc] = player1; //Places player into the array/map
        System.out.println(player1.xLoc +" "+ player1.yLoc);

        Boardclass board = new Boardclass(boardarray);
        board.printboard();

        System.out.println("This is a spot and contains "+ boardarray[1][0].getName());

        //Scans for user input and will move player accordingly North/West/East/South
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Boardclass.moveplayer(player1, boardarray, input, boardlength);
            board.printboard();
        }
    }
}
