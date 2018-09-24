package domain;

public class Game extends Product {

    public Game(String id, String title){
        super(id, title);
    }

    public double calculatePrice(int nbOfDays) {
        return nbOfDays * 3;
    }
}
