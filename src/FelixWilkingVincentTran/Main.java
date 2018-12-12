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
        boardarray[x][y] = new playerclass("Hello");
        Boardclass board = new Boardclass(boardarray);
        board.printboard();
    }
}
