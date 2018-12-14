package FelixWilkingVincentTran;

public class Main {

    public static void main(String[] args) {
        int boardlength = 20;
        int difficulty = 50;

        int x = 0;
        int y = 0;

        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength];
        for(int i = 0; i < difficulty; i++) {
            boardarray[(int) (Math.random() * boardlength)][(int) (Math.random() * boardlength)] = new planet(3);
        }
        playerclass player1 = new playerclass("Jaune", 0, 0);
        boardarray[player1.xLoc][player1.yLoc] = player1;
        System.out.println(player1.xLoc +" "+ player1.yLoc);
       
        Boardclass board = new Boardclass(boardarray);
        board.printboard();
        System.out.print(board.arr[0][0].getName());
       // System.out.print(player1.getName());
    }
}
