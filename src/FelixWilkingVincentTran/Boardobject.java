package FelixWilkingVincentTran;

public class Boardobject {
    private char symbol;
    private String name;

    public Boardobject(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String generateName(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String vowels = "aeiou";
        String name = "";
        for(int i = 0; i < ((int) (Math.random() * 5)); i++){
            name += letters.charAt((int) (Math.random() * letters.length()));
            name += vowels.charAt((int) (Math.random() * vowels.length()));
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

}
