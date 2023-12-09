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
   public String id;
   public String furnitureCategory;
   public int itemCount;
   public double price;
   public String furnitureHistory;
   //constructor
 
   
   
   //methods
   public String getID() {
       return id;
   }
  
   public float calculateDiscount() {
       return discount;
   }
   
   public String getFurnitureCategory() {
       return furnitureCategory;
   }
   
   public String setFurnitureCategory(String category) {
       this.furnitureCategory = category;
       return furnitureCategory;
   }
   
   public String displayDetails() {
       System.out.println("procurement date");
   }
   
   public String associatePurchaser(Purchaser buyer) {
       //binds a buyer to a specific furniture unit
   }
   
   public String showAllFurnitureDetails() {
       System.out.println("Presents a list of all furniture kinds along with their comprehensive details");
   }
   
      public String toString() {
       //which returns a String representation of an object of that class including , furniture details
}

