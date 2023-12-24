import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author 
 * @version 
 */

public class Tester{
    
// The doTest() method where you will write code to test your system
public void doTest() {
    FURNITUREInterface  homeFurnishingsDepot = new FurnitureStore("Home Furnishings Depot", "123 Furniture Street");
    Scanner enter = new Scanner(System.in);
     
     // Write all of your tests here
    homeFurnishingsDepot.addFurniture(new subFurnitureBase(1, "Chair", 4, 75.0));
    homeFurnishingsDepot.addFurniture(new subFurnitureBase(2, "Table", 3, 150.0));

    // Adding purchasers
    homeFurnishingsDepot.addPurchaser(new Purchaser(1, "Customer A", "Furniture Enthusiast"));
    homeFurnishingsDepot.addPurchaser(new Purchaser(2, "Customer B", "Homeowner"));

    // Adding categories
    homeFurnishingsDepot.addCategory(new FurnitureCategory(1, "Chair", 0.1, true, homeFurnishingsDepot.getPurchaserByID(1), "101", 5));
    homeFurnishingsDepot.addCategory(new FurnitureCategory(2, "Table", 0.15, true, homeFurnishingsDepot.getPurchaserByID(2), "102", 3));

    // Viewing furniture details
    System.out.println("Viewing furniture details:");
    furnitureBase chair = homeFurnishingsDepot.getFurnitureByID(1);
    if (chair != null) {
        System.out.println(chair.toString());
    }
    else {
        System.out.println("Furniture not found!");
    }

    // Viewing purchaser details
    System.out.println("\nViewing purchaser details:");
    Purchaser customerA = homeFurnishingsDepot.getPurchaserByID(1);
    if (customerA != null) {
        System.out.println("Name: " + customerA.getName());
        System.out.println("ID: " + customerA.getID());
        System.out.println("Contact Details: " + customerA.getContactDetails());
    }
    else {
        System.out.println("Purchaser not found!");
    }

    // Viewing category details
    System.out.println("\nViewing category details:");
    FurnitureCategory chairCategory = homeFurnishingsDepot.getCategoryByID(1);
    if (chairCategory != null) {
            System.out.println("Name: " + chairCategory.getTypeName());
            System.out.println("ID: " + chairCategory.getID());
            System.out.println("Max Load: " + chairCategory.getMaxLoad());
    }
    else {
        System.out.println("Category not found!");
    }
}
    
    // Main method to make the class executable
    // No need to change this
public static void main(String[] args) {
        Tester tester = new Tester();
        tester.doTest();
}
}