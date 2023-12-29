import java.util.Scanner;

public class LinearSearchMenu {
    public static void main(String[] args) {
        String[] menu = { "Burger", "Pizza", "Pasta", "Sandwich", "Salad", "Soup" };

        // Prompt the user for the food item to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the food item to search: ");
        String itemToSearch = scanner.nextLine();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(itemToSearch)) {
                found = true;
                System.out.println("The food item is available in the menu.");
                break;
            }
        }

        if (!found) {
            System.out.println("The food item is not available in the menu.");
        }
    }
}
