package FelixWilkingVincentTran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int boardlength = 10; //Initialize variable for board dimensions
        int difficulty = 50;

        int x = 0; //X coordinate
        int y = 0; //Y coordinate

        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength]; //Sets the board x and y length
        for(int i = 0; i < difficulty; i++) {
            boardarray[(int) (Math.random() * boardlength)][(int) (Math.random() * boardlength)] = new planet(3);
        }
        playerclass player1 = new playerclass("Jaune", 0, 0); //Initialize the player's name, and x and y coordinates
        boardarray[player1.xLoc][player1.yLoc] = player1;
        System.out.println(player1.xLoc +" "+ player1.yLoc);

        Boardclass board = new Boardclass(boardarray);
        board.printboard();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Boardclass.moveplayer(player1, boardarray, input);

        board.printboard();
    }
}
