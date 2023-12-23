import java.util.*;
/**
 * FurnitureBase represents an individual furniture item within the FurnitureStore system.
 * Each FurnitureBase has a unique ID, a description detailing its characteristics, 
 * a type or category (like chair, table, bed), materials used, dimensions, 
 * and a price. The store's inventory is essentially a collection of FurnitureBase objects.
 * The system relies on the comprehensive data within each FurnitureBase 
 * to manage stock levels, make sales transactions, and provide detailed 
 * product information to both staff and customers. Properly maintained 
 * FurnitureBase records ensure that the store can track product availability, 
 * popularity, and sales trends over time.
 */

public class PassFurnitureBase 
{
   //fields
   public int id;
   public String furnitureCategory;
   public int itemCount;
   public double price;
   public static List<PassFurnitureBase> furnitureInventory;

   public Date procurementDate; // New variable to store procurement date   
    
   // Default Constructor
    public PassFurnitureBase() {
        // Default initialization or actions if needed
    }
    
    // Constructor with parameters for furnitureCategory and itemCount
    public PassFurnitureBase(int id, String furnitureCategory, int itemCount, double price) {
        this.id = id;
        this.furnitureCategory = furnitureCategory;
        this.itemCount = itemCount;
        this.price = price;
        furnitureInventory = new ArrayList<>();
    }
   
   //methods
   public int getID() {
       return id;
   }
  
   public float calculateDiscount() {
       if (price>1000) {
           return (float) (0.1 * price); //10% discount if price is greater than $1,000
        }
        else {
            return 0;
        }
       }
   
   public String getFurnitureCategory() {
       return furnitureCategory;
   }
   
   public void setFurnitureCategory(String category) {
       this.furnitureCategory = category;
   }
   
   public void displayDetails() {
       if (procurementDate != null) {
           System.out.println("Procurement Date: " + procurementDate);
       }
       else {
           System.out.println("No Procurement Date available");
       }
        String details = toString(); // Basic furniture details
   }
   
   public String associatePurchaser(Purchaser buyer) {
       //binds a buyer to a specific furniture unit
    if (buyer.isPurchaseValid(5)) { // Using 5 as the maximum valid purchases
        buyer.addToPurchaseHistory(this.furnitureCategory);
        return "Purchaser associated: " + buyer.getName();
    } else {
        return "Purchase limit exceeded for this buyer.";
    }
   }
   
   public static void showAllFurnitureDetails() { //Presents a list of all furniture kinds along with their comprehensive details
       List<FurnitureCategory> categories = FurnitureCategory.getAllCategories();
       for (FurnitureCategory category : categories) {
            System.out.println("Category: " + category.getTypeName());
            System.out.println("Max Load: " + category.getMaxLoad());
            System.out.println("Suitable for Outdoor: " + category.isSuitableForOutdoor());
            System.out.println("Room Recommendation: " + category.getRoomRecommendation());

            System.out.println("Materials: ");
            List<String> materials = category.materials;
            for (String material : materials) {
                System.out.println(material);
            }
        }
   }
   
   public String toString() {
          return "ID=" + id + 
              " \nFurniture Category=" + furnitureCategory +
              " \nItem Count=" + itemCount +
              " \nPrice=" + price;
   }
    
   //Extra methods:
   
   //adds furniture objects to inventory
   public static void addToFurnitureInventory(PassFurnitureBase item) {
       furnitureInventory.add(item);
   }
   
   //sets the procurement date
   public void setProcurementDate(Date date) {
   this.procurementDate = date;
   }
   
   //displays the items in inventory
   public void displayFurnitureInventory() {
        if (furnitureInventory.isEmpty()) {
            System.out.println("Furniture Inventory is empty.");
        }
        else {
            System.out.println("Furniture Inventory:");
            for (PassFurnitureBase item : furnitureInventory) {
                System.out.println(item.toString());
            }
        }
    }
}
