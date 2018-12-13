package FelixWilkingVincentTran;

import java.util.Scanner;

public class Boardclass {
    private Boardobject[][] board;

    public Boardclass(Boardobject[][] board){

        this.board = board;
    }

    public void printboard(){
        for(Boardobject[] y : this.board){
            for(Boardobject x : y){
                if(x == null){
                    System.out.print("  ");
                }
                else{
                    System.out.print(x.getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public void move(int x1, int y1, int x2, int y2){
        Boardobject placeholder = this.board[x1][y1];
        this.board[x1][y1] = null;
        this.board[x2][y2] = placeholder;
    }

    public void moveplayer(playerclass player, String direction){

        Scanner input = new Scanner(System.in);
        if(input.equals("n")){

        }
        if(input.equals("w")){

        }
        if(input.equals("e")){

        }
        if(input.equals("s")){

        }
    }
}
