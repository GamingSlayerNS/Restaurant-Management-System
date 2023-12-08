package Components.Kitchen;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    String[] categories = {"Breakfast", "Sandwich", "Fish", "Pasta", "Pizzas", "Burgers", "Drinks", "Dessert"};
    String[] names = {"Eggs", "Pancakes", "Waffles", "Turkey Sandwich", "Ham Sandwich", "Bacon Sandwich", "Salmon", "Tuna", "Cat Fish",
                    "Fettuccine Alfredo", "Carbonara", "Spaghetti", "Pepperoni Pizza", "Cheese Pizza", "Spinach Pizza", "Hamburger", "Hash-burger", "Quarter Pounder",
                    "Milk & Water", "Coffee", "Green Tea", "Vanilla Pecan Ice Cream", "Pecan Pie", "Pecan Tres Leches"};
    ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public Menu() {
        for (int i = 0; i < names.length; i++) {
            MenuItem tempItem = new MenuItem(names[i], (Math.random() * 10), categories[i / 3]);
            menu.add(tempItem);
        }
    }

    public void viewMenu() {
        for (String cat : categories) {
            System.out.println(cat);
        }
    }

    public void selectCategory(String category) {
        if (Arrays.stream(categories).anyMatch(category::equals)) {
            for (MenuItem m : menu) {
                if (m.category.equals(category)) {
                    System.out.printf("%-25s %.2f\t%s%n", m.name, m.price, m.category);
                }
            }
        } else {
            System.out.println("Category Unavailable");
        }
    }
}
