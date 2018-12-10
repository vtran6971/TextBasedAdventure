package FelixWilkingVincentTran;

public class Main {

    public static void main(String[] args) {
        int boardlength = 6;
        Boardobject Goblin = new Boardobject("Goblin");
        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength];
        boardarray[0][3] = Goblin;
        Boardclass board = new Boardclass(boardarray);
        board.printboard();
    }
}
