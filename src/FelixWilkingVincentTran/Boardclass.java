package FelixWilkingVincentTran;

import java.util.Scanner;

public class Boardclass {
    public Boardobject[][] arr;

    public Boardclass(Boardobject[][] board){

        this.arr = board;
    }

    public void printboard(){
        for(Boardobject[] y : this.arr){
            for(Boardobject x : y){
                if(x == null){
                    System.out.print("- ");
                }
                else{
                    System.out.print(x.getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public void move(int x1, int y1, int x2, int y2){
        Boardobject placeholder = this.arr[x1][y1];
        this.arr[x1][y1] = null;
        this.arr[x2][y2] = placeholder;
    }

    public static boolean moveplayer(playerclass player, String direction, Boardclass[][] board){


        Scanner input = new Scanner(System.in);
        if(input.equals("n")){
        board[player.xLoc][player.North()];
        }

        if(input.equals("w")){

        }

        if(input.equals("e")){

        }

        if(input.equals("s")){

        }
    }
}
