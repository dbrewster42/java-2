public class Side {
    private int price;
    private String name;
    final public static Side FRIES = new Side("fries", 200);
    final public static Side FRUIT = new Side("fruit", 200);
    final public static Side ORINGS = new Side("onion rings", 250);
    final public static Side COOKIE = new Side("chocolate chip cookie", 150);
    final public static Side BROWNIE = new Side("brownie", 150);

    private Side(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}