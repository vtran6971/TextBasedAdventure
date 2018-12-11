package FelixWilkingVincentTran;

public class Boardclass {
    private Boardobject[][] board;

    public Boardclass(Boardobject[][] board){
        this.board = board;
    }

    public void printboard(){
        for(Boardobject[] y : this.board){
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
}
