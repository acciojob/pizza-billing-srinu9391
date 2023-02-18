public class Main {
  public static void main(String[] args) {
    Pizza regularPizza = new Pizza("regular", "veg");
    regularPizza.addExtraCheese();
    regularPizza.addToppings();
    regularPizza.addToppings();
    regularPizza.addPaperBag();
    regularPizza.printBill();

    System.out.println();

    DeluxePizza deluxePizza = new DeluxePizza("non-veg");
    deluxePizza.addToppings();
    deluxePizza.addToppings();
    deluxePizza.addExtraCheese();
    deluxePizza.printBill();
  }
}
