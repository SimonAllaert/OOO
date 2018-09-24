package domain;

public abstract class Product implements PriceCalculator {

    private String id;
    private String title;

    public Product(String id, String title) {

    }

    public double getPrice(int nbOfDays) {
        return calculatePrice(nbOfDays);
    }

    public void setPriceCalculation() {

    }
}
