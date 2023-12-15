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
   public String furnitureHistory;

   // Default Constructor
    public PassFurnitureBase() {
        // Default initialization or actions if needed
    }
    
    // Constructor with parameters for furnitureCategory and itemCount
    public PassFurnitureBase(int id, String furnitureCategory, int itemCount, double price, String furnitureHistory) {
        this.id = id;
        this.furnitureCategory = furnitureCategory;
        this.itemCount = itemCount;
        this.price = price;
        this.furnitureHistory = furnitureHistory;
    }
   
   //methods
   public int getID() {
       return id;
   }
  
   public float calculateDiscount() {
       return 0;
   }
   
   public String getFurnitureCategory() {
       return furnitureCategory;
   }
   
   public void setFurnitureCategory(String category) {
       this.furnitureCategory = category;
   }
   
   public String displayDetails() {
       System.out.println("procurement date");
       return "temp";
   }
   
   public String associatePurchaser(Purchaser buyer) {
       //binds a buyer to a specific furniture unit
       return "temp";
   }
   
   public String showAllFurnitureDetails() {
       System.out.println("Presents a list of all furniture kinds along with their comprehensive details");
       return "temp";
    }
   
   public String toString() {
          return "ID=" + id + 
              " \nFurniture Category=" + furnitureCategory +
              " \nItem Count=" + itemCount +
              " \nPrice=" + price +
              " \nFurniture History=" + furnitureHistory;
    }
}
