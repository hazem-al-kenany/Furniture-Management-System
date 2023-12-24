import java.util.*;
/**
 * A Purchaser is a vital entity in the FurnitureStore system. Each Purchaser has an ID, 
 * a name, contact information including phone number, email, and a physical address. 
 * Purchasers are the customers or clients who make orders or procure furniture items 
 * from the store. The system keeps track of each Purchaser to maintain order histories, 
 * shipping details, and other transaction-related records. Detailed information about 
 * every Purchaser is essential for the store's customer relationship management, 
 * facilitating personalized services, promotions, and streamlined communication.
 */
public class Purchaser {
    // Attributes
    public int id;
    public String name;
    public String furnitureType;
    public String contactDetails;
    public Date purchaseDate;
    public List<String> purchaseHistory;
    
    //extra attributes
    public furnitureBase furnitureItem; //links the ordered item to the corresponding furniture pieces (purchaser class)
    
    //constructor with id, name, and furnitureType
        public Purchaser(int id, String name, String furnitureType) {
        this.id = id;
        this.name = name;
        this.furnitureType = furnitureType;
        this.purchaseDate = new Date(); // Initialize with current date
        this.purchaseHistory = new ArrayList<>();
    }
    // Overloaded constructor initializing all attributes
        public Purchaser(int id, String name, String furnitureType, String contactDetails, Date purchaseDate) {
        this.id = id;
        this.name = name;
        this.furnitureType = furnitureType;
        this.contactDetails = contactDetails;
        this.purchaseDate = purchaseDate;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
        public int getID() {
        return id;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
    
        public void addToPurchaseHistory(String item) {
        this.purchaseHistory.add(item);
    }
    
        public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    //might be restricted from making more purchases or might get exclusive access to buy certain premium items.
        public boolean isPurchaseValid(int THRESHOLD_VALUE) {
        return purchaseHistory.size() < THRESHOLD_VALUE;
    }
    
    //Extra methods for linking an undefined order to item
    
        public void setFurnitureItem(furnitureBase furnitureItem) {
        this.furnitureItem = furnitureItem;
    }
    
        public furnitureBase getFurnitureItem() {
        return furnitureItem;
    }
}
