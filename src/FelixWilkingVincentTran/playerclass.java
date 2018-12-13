package FelixWilkingVincentTran;

public class playerclass extends Boardobject {
    private String name;

    public playerclass(String name, int xLoc, int yLoc){
        this.name = name;
    }

    int xLoc, yLoc;

    public int getxLoc()
    {
        return xLoc;
    }

    public  void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }

    public  void setyLoc(int yLoc)
    {
        this.yLoc = yLoc;
    }

}
