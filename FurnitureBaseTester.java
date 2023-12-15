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
        PassFurnitureBase chair = new PassFurnitureBase(1, "Chair", 10, 49.99, "Wooden chair");
        PassFurnitureBase table = new PassFurnitureBase(2, "Table", 5, 149.99, "Oak wood table");

        // Displaying initial details
        System.out.println("Initial Details:");
        System.out.println(chair.toString());
        System.out.println(table.toString());

        // Modifying details using setters
        chair.setFurnitureCategory("Foldable Chair");
        table.setFurnitureCategory("Foldable Table");

        // Displaying updated details
        System.out.println("\nUpdated Details:");
        System.out.println(chair.toString());
        System.out.println(table.toString());

        // Calculating discount for a furniture item
        float chairDiscount = chair.calculateDiscount();
        System.out.println("\nDiscount for chair: " + chairDiscount);

        // Displaying furniture category
        System.out.println("\nChair Category: " + chair.getFurnitureCategory());

        // Associating a purchaser
        Purchaser buyer = new Purchaser("John Doe", "john@example.com");
        chair.associatePurchaser(buyer);
        System.out.println("\nAssociated Purchaser for Chair: " + chair.getPurchaserDetails()); //not yet implemented

        // Displaying all furniture details
        System.out.println("\nAll Furniture Details:");
        chair.showAllFurnitureDetails();
        table.showAllFurnitureDetails();
    }
}    
