import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * Write a description of class FurnitureStoreUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class FurnitureStoreUI {
    private Scanner reader = new Scanner(System.in);
    private FURNITUREInterface store = new FurnitureStore("Fortune Furnitures", "Downtown");

    public void runUI() {
    
    
        int choice = getOption();

     // process choice
        while (choice != 0) {
            switch (choice) {
                case 1:
                    addFurniture();
                    break;
                case 2:
                    addPurchaser();
                    break;
                case 3:
                    addCategory();
                    break;
                case 4:
                    viewFurniture();
                    break;
                case 5:
                    viewPurchaser();
                    break;
                case 6:
                    viewCategory();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        // output menu & get choice
            choice = getOption();
        }
        System.out.println("\nThank you for using Fortune Furnitures System.");
    }

    private int getOption() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("0. Quit");
        System.out.println("1. Add furniture");
        System.out.println("2. Add purchaser");
        System.out.println("3. Add category");
        System.out.println("4. View furniture details by ID");
        System.out.println("5. View purchaser details by ID");
        System.out.println("6. View category details by ID");
        System.out.print("Enter your choice: ");
        

    System.out.println("Enter your choice");
        // read choice
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }

    private void addFurniture() {
        System.out.println("Enter furniture details:");
        System.out.print("ID: ");
        String id = reader.nextLine();
        System.out.print("Category: ");
        String category = reader.nextLine();
        System.out.print("Item Count: ");
        int itemCount = reader.nextInt();
        System.out.print("Price: ");
        double price = reader.nextDouble();
        reader.nextLine(); // Consume newline
        System.out.print("History: ");
        String history = reader.nextLine();

        PassFurnitureBase furniture = new PassFurnitureBase(id, category, itemCount, price, history);
        store.addFurniture(furniture);
        System.out.println("Furniture added successfully!");
    }

    private void addPurchaser() {
        System.out.println("Enter purchaser details:");
        System.out.print("ID: ");
        String id = reader.nextLine();
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Furniture Type: ");
        String furnitureType = reader.nextLine();
        System.out.print("Contact Details: ");
        String contactDetails = reader.nextLine();
        System.out.print("Purchase Date (dd-MM-yyyy): ");
        String purchaseDateString = reader.nextLine();

        // Date input
        Date purchaseDate = null;
        try {
            purchaseDate = new SimpleDateFormat("dd-MM-yyyy").parse(purchaseDateString);
        } catch (ParseException e) {
            e.printStackTrace(); //this had to be added to fix compilation errors
        }

        Purchaser purchaser = new Purchaser(id, name, furnitureType, contactDetails, purchaseDate);
        store.addPurchaser(purchaser);
        System.out.println("Purchaser added successfully!");
    }

    private void addCategory() {
        System.out.println("Enter category details:");
        System.out.print("ID: ");
        String id = reader.nextLine();
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Discount: ");
        double discount = reader.nextDouble();
        System.out.print("Availability (true/false): ");
        boolean available = reader.nextBoolean();
        reader.nextLine(); // Consume newline
        System.out.print("Supplier ID: ");
        int supplierId = reader.nextInt();
        reader.nextLine(); // Consume newline
        System.out.print("Order ID: ");
        String orderId = reader.nextLine();
        System.out.print("Quantity: ");
        int quantity = reader.nextInt();

        // Retrieve supplier and furniture category
        Purchaser supplier = store.getPurchaserByID(supplierId); //returns the purchaser linked with the id (From the array list)
        FurnitureCategory category = new FurnitureCategory(id, name, discount, available, supplier, orderId, quantity);
        store.addCategory(category);
        System.out.println("Category added successfully!");
    }

    private void viewFurniture() {
        System.out.print("Enter furniture ID: ");
        int furnitureId = reader.nextInt();
        PassFurnitureBase furniture = store.getFurnitureByID(furnitureId);
        if (furniture != null) {
            System.out.println("Furniture Details:");
            System.out.println(furniture.toString());
        } else {
            System.out.println("Furniture not found!");
        }
    }

    private void viewPurchaser() {
       System.out.println("Enter Purchaser ID: ");
       int purchaserID = reader.nextInt();
       Purchaser purchaser = store.getPurchaserByID(purchaserID);
       if (purchaser != null) {
           System.out.println("Purchaser Details:");
           System.out.println("Name: " + purchaser.getName());
           System.out.println("ID: " + purchaser.getID());
           System.out.println("Contact Details: " + purchaser.getContactDetails());
       }
       else {
           System.out.println("Purchaser not found!");
       }
    }

    private void viewCategory() {
        System.out.print("Enter category ID: ");
        int categoryId = reader.nextInt();
        FurnitureCategory category = store.getCategoryByID(categoryId);
        if (category != null) {
            System.out.println("Category Details:");
            System.out.println("Name: " + category.getTypeName());
            System.out.println("ID: " + category.getID());
            System.out.println("Max Load: " + category.getMaxLoad());
        } else {
            System.out.println("Category not found!");
        }
    }

    public static void main(String[] args) {
        FurnitureStoreUI ui = new FurnitureStoreUI();
        ui.runUI();
    }
}
