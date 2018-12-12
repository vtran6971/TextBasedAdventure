package FelixWilkingVincentTran;

public class Main {

    public static void main(String[] args) {
        int boardlength = 20;
        int difficulty = 50;
        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength];
        for(int i = 0; i < difficulty; i++) {
            boardarray[(int) (Math.random() * boardlength)][(int) (Math.random() * boardlength)] = new planet(3);
        }
        Boardclass board = new Boardclass(boardarray);
        board.printboard();
    }
}
