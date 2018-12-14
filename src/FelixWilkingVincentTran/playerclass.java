package FelixWilkingVincentTran;

public class playerclass extends Boardobject {
    private String name;

    public playerclass(String name, int xLoc, int yLoc){
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    int xLoc, yLoc;

    public String getName()
    {
        return name;
    }

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
