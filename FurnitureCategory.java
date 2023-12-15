import java.util.*;
/**
 * FurnitureCategory denotes a specific category or type within the FurnitureStore system.
 * Each category is distinct, such as chairs, tables, beds, or sofas. Every FurnitureCategory 
 * has a unique name, a general description outlining its features, and potentially other 
 * attributes like average price range, typical materials used, or general care instructions.
 * This categorization helps both the store's staff and customers in sorting, identifying, 
 * and narrowing down their product searches. It streamlines inventory management by 
 * grouping similar items, facilitating bulk operations, and assisting in sales analytics.
 * The FurnitureCategory also aids in promotional activities, allowing for category-wide 
 * discounts or special deals.
 */
public class FurnitureCategory {
    //Attributes
    public int id;
    public String typeName;
    public double maximumLoad;
    public boolean isOutdoor;
    public Purchaser recentPurchaser;
    public List<String> materials;
    
    //extra attributes for "Orders"
    public String orderId;
    public int quantity;
    
    //A constructor that takes arguments to set the initial values for the attributes.
        public FurnitureCategory(int id, String typeName, double maximumLoad, boolean isOutdoor, Purchaser recentPurchaser, String orderId, int quantity) {
        this.id = id;
        this.typeName = typeName;
        this.maximumLoad = maximumLoad;
        this.isOutdoor = isOutdoor;
        this.recentPurchaser = recentPurchaser;
        this.materials = new ArrayList<>();
        
        this.orderId = orderId;
        this.quantity = quantity;
    }
    
        public int getID() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getMaxLoad() {
        return maximumLoad;
    }

    public String getRoomRecommendation() {
        //Indicates the recommended room for this furniture.
        // Example logic:
        if (typeName.equals("Sofa")) {
            return "Living room";
        } else if (typeName.equals("Table")) {
            return "Dining room";
        } else if (typeName.equals("Chair")) {
            return "Study room";
        } else {
            return "Unknown recommendation";
        }
    }
    
        public void addMaterial(String material) {
        materials.add(material);
    }
    
        public boolean isSuitableForOutdoor() {
        return isOutdoor && maximumLoad > 50.0;
    }
    //Extra methods for linking an undefined order to item
    private PassFurnitureBase furnitureItem;
    
        public void setFurnitureItem(PassFurnitureBase furnitureItem) {
        this.furnitureItem = furnitureItem;
    }
    
        public PassFurnitureBase getFurnitureItem() {
        return furnitureItem;
    }
}
