package FelixWilkingVincentTran;

public class playerclass extends Boardobject {
    private String name;
    int xLoc;
    int yLoc;

    public playerclass(String name, int xLoc, int yLoc){
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc)
    {

        this.yLoc = yLoc;
    }

    public int North(int yLoc)
    {
        return yLoc+1;
    }

    public int East(int xLoc)
    {
        return yLoc+1;
    }

    public int West(int xLoc)
    {
        return xLoc-1;
    }

    public int South(int yLoc)
    {
        return yLoc-1;
    }

    public String getName()
    {
        return name;
    }

    public int getxLoc()
    {
        return xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }


}
