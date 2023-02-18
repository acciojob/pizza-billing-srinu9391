public class DeluxePizza extends Pizza {
    public DeluxePizza(String category) {
        super("deluxe", category);
        addExtraCheese();
        addToppings();
    }
}
