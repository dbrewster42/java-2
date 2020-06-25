// package burger_shop;

class Topping {
    public String name;
    private int price = 50;

    public Topping(String name) {
        this(name, 50);
    }

    public Topping(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
