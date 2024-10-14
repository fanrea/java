abstract class Dish implements Order {

    double price;
    String name;

    public Dish(double price, String name) {
        this.price = price;
        this.name = name;
    }

    abstract public void profile();
}