// package burger_shop;

class Topping {
    public String name;
    // private int price = 50;
    private int price;
    private boolean healthy;
    // final public static Topping tomato = new Topping("tomato", 27);
    final public static Topping Lettuce = new Topping("lettuce", true);
    final public static Topping Tomatoes = new Topping("tomatoes", true);
    final public static Topping Alfafa = new Topping("alfafa", true);
    final public static Topping Onions = new Topping("onions", true);
    final public static Topping Pickles = new Topping("pickles", true);
    final public static Topping Jalepenos = new Topping("grilled jalepenos", true, 100);
    final public static Topping Guacamole = new Topping("guacamole", true, 200);
    final public static Topping Cheese = new Topping("cheese", false, 100);
    final public static Topping Bacon = new Topping("bacon", false, 150);
    final public static Topping GOnions = new Topping("grilled onions", true, 100);

    // enum allToppings {
    //     lettuce, tomatoes, alfafa, onions, pickles, jalepenos, guacamole, cheese, bacon, gOnions
    // }

    private Topping(String name, boolean healthy) {
        this(name, healthy, 50);
    }

    private Topping(String name, boolean healthy, int price) {
        this.name = name;
        this.healthy = healthy;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean getHealthy() {
        return this.healthy;
    }
}
