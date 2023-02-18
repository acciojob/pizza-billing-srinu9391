public class Pizza {
    private String type;
    private String category;
    private boolean extraCheese;
    private int extraToppings;
    private boolean paperBag;
    private int basePrice;
    private final int VEG_PRICE = 300;
    private final int NON_VEG_PRICE = 400;
    private final int EXTRA_CHEESE_PRICE = 80;
    private final int VEG_TOPPINGS_PRICE = 70;
    private final int NON_VEG_TOPPINGS_PRICE = 120;
    private final int PAPER_BAG_PRICE = 20;

    public Pizza(String type, String category) {
        this.type = type;
        this.category = category;
        this.extraCheese = false;
        this.extraToppings = 0;
        this.paperBag = false;
        if (this.category.equals("veg")) {
            this.basePrice = VEG_PRICE;
        } else {
            this.basePrice = NON_VEG_PRICE;
        }
    }

    public void addExtraCheese() {
        if (!extraCheese) {
            extraCheese = true;
            basePrice += EXTRA_CHEESE_PRICE;
        }
    }

    public void addToppings() {
        if (this.category.equals("veg")) {
            basePrice += VEG_TOPPINGS_PRICE;
        } else {
            basePrice += NON_VEG_TOPPINGS_PRICE;
        }
        extraToppings++;
    }

    public void addPaperBag() {
        if (!paperBag) {
            paperBag = true;
            basePrice += PAPER_BAG_PRICE;
        }
    }

    public void printBill() {
        System.out.println("Base Price Of The Pizza: " + basePrice);
        if (extraCheese) {
            System.out.println("Extra Cheese Added: " + EXTRA_CHEESE_PRICE);
        }
        if (extraToppings > 0) {
            if (category.equals("veg")) {
                System.out.println("Extra Toppings Added: " + (extraToppings * VEG_TOPPINGS_PRICE));
            } else {
                System.out.println("Extra Toppings Added: " + (extraToppings * NON_VEG_TOPPINGS_PRICE));
            }
        }
        if (paperBag) {
            System.out.println("Paperbag Added: " + PAPER_BAG_PRICE);
        }
        System.out.println("Total Price: " + basePrice);
    }
}
