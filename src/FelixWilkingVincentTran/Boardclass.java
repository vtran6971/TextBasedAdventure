package FelixWilkingVincentTran;

public class Boardclass {
    private Boardobject[][] board;

    public Boardclass(Boardobject[][] board){
        this.board = board;
    }

    public void printboard(){
        for(Boardobject[] y : this.board){
            for(Boardobject[] x : this.board){
                if(x[0] == null){
                    System.out.print("- ");
                }
                else{
                    System.out.print(x[0].getName() + " ");
                }
            }
            System.out.println();
        }
    }
}
