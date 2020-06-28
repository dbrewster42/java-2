// package burger_shop;

class Topping {
    public String name;
    // private int price = 50;
    private int price;
    // final public static Topping tomato = new Topping("tomato", 27);
    final public static Topping Lettuce = new Topping("lettuce");
    final public static Topping Tomatoes = new Topping("tomatoes");
    final public static Topping Alfafa = new Topping("alfafa");
    final public static Topping Onions = new Topping("onions");
    final public static Topping Pickles = new Topping("pickles");
    final public static Topping Jalepenos = new Topping("grilled jalepenos", 100);
    final public static Topping Guacamole = new Topping("guacamole", 200);
    final public static Topping Cheese = new Topping("cheese", 100);
    final public static Topping Bacon = new Topping("bacon", 150);
    final public static Topping GOnions = new Topping("grilled onions", 100);

    // enum allToppings {
    //     lettuce, tomatoes, alfafa, onions, pickles, jalepenos, guacamole, cheese, bacon, gOnions
    // }

    private Topping(String name) {
        this(name, 50);
    }

    private Topping(String name, int price) {
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
