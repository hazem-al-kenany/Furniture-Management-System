import java.util.*;
/**
 * Write a description of class FurnitureBaseTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FurnitureBaseTester
{
    public static void main(String[] args)
    {
        // Creating FurnitureBase objects using different constructors
        furnitureBase chair = new subFurnitureBase(1, "Chair", 10, 49.99);
        furnitureBase table = new subFurnitureBase(2, "Table", 5, 149.99);

        // Displaying initial details
        System.out.println("Initial Details:");
        System.out.println(chair.toString());
        System.out.println(table.toString());

        // Modifying details using setters
        chair.setFurnitureCategory("Foldable Chair");
        table.setFurnitureCategory("Foldable Table");
        
        // Adding both objects to inventory
        furnitureBase.addToFurnitureInventory(chair);
        furnitureBase.addToFurnitureInventory(table);
        
        // Displaying items in inventory + updated category
        System.out.println("\nUpdated Details:");
        chair.displayFurnitureInventory();
        table.displayFurnitureInventory();

        // Calculating discount for a furniture item
        float chairDiscount = chair.calculateDiscount();
        System.out.println("\nDiscount for chair: " + chairDiscount);

        // Displaying furniture category
        System.out.println("\nChair Category: " + chair.getFurnitureCategory());

        // Associating a purchaser
        Purchaser buyer = new Purchaser(1, "John Doe", "john@example.com");
        String associatedPurchaser = chair.associatePurchaser(buyer);
        System.out.println(associatedPurchaser);
        System.out.println("Details for Purchaser of Chair: " + buyer.getContactDetails());
        
        // Set procurement date and display details
        chair.setProcurementDate(new Date());
        System.out.println("\nDetails after setting procurement date:");
        chair.displayDetails();
        
        // Adding Furniture Categories
        FurnitureCategory sofaCategory = new FurnitureCategory(1, "Sofa", 200.0, true, buyer, "SOFA-ORDER-001", 10);
        FurnitureCategory diningTableCategory = new FurnitureCategory(2, "Dining Table", 150.0, false, buyer, "TABLE-ORDER-002", 5);
        // Showing all furniture details
        System.out.println("\nAll Furniture Details:");
        furnitureBase.showAllFurnitureDetails();
    }
}    
