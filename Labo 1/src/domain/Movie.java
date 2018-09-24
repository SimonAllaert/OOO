package domain;

public class Movie extends Product {

    public Movie(String id, String title){
        super(id, title);
    }

    public double calculatePrice(int nbOfDays) {
        int price = 5;
        int daysLeft = nbOfDays - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
