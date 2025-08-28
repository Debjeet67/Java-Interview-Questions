import java.util.*;

// --- Data model classes (non-public, same file) ---
class FoodItem {
    private final int id;
    private final String name;
    private final double price;

    FoodItem(int id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }
    int getId() { return id; }
    String getName() { return name; }
    double getPrice() { return price; }

    @Override public String toString() {
        return id + ". " + name + " - ₹" + String.format("%.2f", price);
    }
}

class CartItem {
    private final FoodItem item;
    private int quantity;

    CartItem(FoodItem item, int quantity) {
        this.item = item; this.quantity = quantity;
    }
    FoodItem getItem() { return item; }
    int getQuantity() { return quantity; }
    void setQuantity(int q) { this.quantity = q; }
    double getSubtotal() { return item.getPrice() * quantity; }

    @Override public String toString() {
        return item.getName() + " x" + quantity +
               " = ₹" + String.format("%.2f", getSubtotal());
    }
}

class Menu {
    private final Map<Integer, FoodItem> items = new LinkedHashMap<>();

    Menu() {
        // seed menu
        add(new FoodItem(1, "Margherita Pizza", 199));
        add(new FoodItem(2, "Cheese Burger", 149));
        add(new FoodItem(3, "French Fries", 79));
        add(new FoodItem(4, "Veg Wrap", 129));
        add(new FoodItem(5, "Cold Drink (500ml)", 49));
        add(new FoodItem(6, "Chicken Biryani", 249));
        add(new FoodItem(7, "Paneer Tikka", 189));
    }

    void add(FoodItem fi) { items.put(fi.getId(), fi); }
    FoodItem get(int id)  { return items.get(id); }

    void display() {
        System.out.println("\n--- MENU ---");
        for (FoodItem fi : items.values()) System.out.println(fi);
    }
}

public class OnlineFoodOrdering {
    private static final double TAX_PERCENT = 5.0; // 5% GST demo
    private static final Scanner sc = new Scanner(System.in);
    private static final Menu menu = new Menu();
    private static final List<CartItem> cart = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Welcome to Online Food Ordering ===");
        boolean running = true;

        while (running) {
            printMain();
            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> menu.display();
                case 2 -> addToCart();
                case 3 -> removeFromCart();
                case 4 -> viewCart();
                case 5 -> checkout();
                case 6 -> { running = false; System.out.println("Goodbye!"); }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }

    private static void printMain() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Show Menu");
        System.out.println("2. Add Item to Cart");
        System.out.println("3. Remove Item from Cart");
        System.out.println("4. View Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Exit");
    }

    private static void addToCart() {
        menu.display();
        int id = readInt("Enter item ID to add: ");
        FoodItem fi = menu.get(id);
        if (fi == null) { System.out.println("Invalid item ID."); return; }

        int qty = readInt("Enter quantity: ");
        if (qty <= 0) { System.out.println("Quantity must be >= 1."); return; }

        // if already in cart, update quantity
        for (CartItem ci : cart) {
            if (ci.getItem().getId() == id) {
                ci.setQuantity(ci.getQuantity() + qty);
                System.out.println("Updated: " + fi.getName() + " x" + ci.getQuantity());
                return;
            }
        }
        cart.add(new CartItem(fi, qty));
        System.out.println("Added: " + fi.getName() + " x" + qty);
    }

    private static void removeFromCart() {
        if (cart.isEmpty()) { System.out.println("Cart is empty."); return; }
        viewCart(false);

        int id = readInt("Enter item ID to remove (entire line): ");
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItem().getId() == id) {
                System.out.println("Removed: " + cart.get(i).getItem().getName());
                cart.remove(i);
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    private static void viewCart() { viewCart(true); }

    private static void viewCart(boolean showTotals) {
        if (cart.isEmpty()) { System.out.println("Cart is empty."); return; }
        System.out.println("\n--- Your Cart ---");
        double subtotal = 0;
        for (CartItem ci : cart) {
            System.out.println(ci);
            subtotal += ci.getSubtotal();
        }
        if (showTotals) {
            System.out.printf("Subtotal: ₹%.2f%n", subtotal);
            double tax = subtotal * TAX_PERCENT / 100.0;
            System.out.printf("Tax (%.1f%%): ₹%.2f%n", TAX_PERCENT, tax);
            System.out.printf("Grand Total: ₹%.2f%n", subtotal + tax);
        }
    }

    private static void checkout() {
        if (cart.isEmpty()) { System.out.println("Cart is empty."); return; }
        System.out.print("Enter customer name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) name = "Guest";

        System.out.println("\n--- Receipt ---");
        double subtotal = 0;
        for (CartItem ci : cart) {
            System.out.println(ci);
            subtotal += ci.getSubtotal();
        }
        double tax = subtotal * TAX_PERCENT / 100.0;
        double grand = subtotal + tax;

        System.out.println("---------------------------");
        System.out.printf("Customer : %s%n", name);
        System.out.printf("Subtotal : ₹%.2f%n", subtotal);
        System.out.printf("Tax (%.1f%%): ₹%.2f%n", TAX_PERCENT, tax);
        System.out.printf("Total    : ₹%.2f%n", grand);
        System.out.println("Thank you! Order placed.");
        cart.clear(); // reset cart
    }

    // robust int input helper
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                sc.nextLine(); // consume newline
                return x;
            } else {
                System.out.println("Please enter a number.");
                sc.nextLine(); // discard invalid
            }
        }
    }
}
