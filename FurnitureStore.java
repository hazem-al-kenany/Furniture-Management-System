import java.util.*;

/**This class implements the FIRE FURNITUREInterface interface
 **/
public class FurnitureStore implements FURNITUREInterface // do not change this header

{
    private String storeName;
    private String location;

    //Collections to manage references
    public List<PassFurnitureBase> allFurniturePieces;
    public List<Purchaser> allSuppliers;
    public List<FurnitureCategory> allCustomerOrders;
    
    // Constructor
    public FurnitureStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
        
        allFurniturePieces = new ArrayList<>();
        allSuppliers = new ArrayList<>();
        allCustomerOrders = new ArrayList<>();

        loadFurnitureAndSuppliers();
        loadOrders();
    }

    // Implementation of the methods from FURNITURE interface
    @Override
    public void addFurniture(PassFurnitureBase furniture) {
       
    }

    @Override
    public void addPurchaser(Purchaser purchaser) {
     
    }

    @Override
    public void addCategory(FurnitureCategory category) {
       
    }

    @Override
    public FurnitureBase getFurnitureByID(int id) {


    return null; // Not found
    }

    @Override
    public Purchaser getPurchaserByID(int id) {
     

    return null; // Not found
    }

    @Override
    public FurnitureCategory getCategoryByID(int id) {


    
        return null; // Not found
    }

    // Private methods as specified
    private void loadFurnitureAndSuppliers() {
        // Logic to populate furnitureItems and suppliers
        // This may involve instantiating new FurnitureBase and Purchaser objects and adding them to the respective lists.
        
        //Creating furniture objects
        PassFurnitureBase chair = new PassFurnitureBase("1", "Chair", 1, 100.0, "Wooden Chair");
        PassFurnitureBase table = new PassFurnitureBase("2", "Table", 1, 300.0, "Dining Table");
        PassFurnitureBase sofa = new PassFurnitureBase("3", "Sofa", 1, 800, "Leather Sofa");
        PassFurnitureBase bed = new PassFurnitureBase("4", "Bed", 1, 1200, "King Sized Bed");
        PassFurnitureBase wardrobe = new PassFurnitureBase("5", "Wardrobe", 1, 900, "Wooden Wardrobe");
        
        // Adding furniture pieces to the collection based on their IDs
        allFurniturePieces.add(Integer.parseInt(chair.getID()) - 1, chair);
        allFurniturePieces.add(Integer.parseInt(table.getID()) - 1, table);
        allFurniturePieces.add(Integer.parseInt(sofa.getID()) - 1, sofa);
        allFurniturePieces.add(Integer.parseInt(bed.getID()) - 1, bed);
        allFurniturePieces.add(Integer.parseInt(wardrobe.getID()) - 1, wardrobe);
        
        //Creating Suppliers/Purchasers
        Date currentDate = new Date();
        Purchaser ikea = new Purchaser("1", "IKEA", "n/a", "ikea@example.com", currentDate);
        Purchaser walmart = new Purchaser("2", "Walmart", "n/a", "walmart@example.com", currentDate);
        Purchaser westElm = new Purchaser("3", "West Elm", "n/a", "westelm@example.com", currentDate);
        Purchaser target = new Purchaser("4", "Target", "n/a", "target@example.com", currentDate);
        Purchaser homeGoods = new Purchaser("5", "HomeGoods", "n/a", "homegoods@example.com", currentDate);
        
        //Adding suppliers to the collection
        allSuppliers.add(ikea);
        allSuppliers.add(walmart);
        allSuppliers.add(westElm);
        allSuppliers.add(target);
        allSuppliers.add(homeGoods);
    }

    private void loadOrders() {
        // Logic to populate customerOrders
        // This may involve instantiating new FurnitureCategory objects and adding them to the list.
        
        //Declaring purchaser variables (linking object with the list)
        Purchaser ikea = allSuppliers.get(0);
        Purchaser walmart = allSuppliers.get(1);
        Purchaser westElm = allSuppliers.get(2);
        Purchaser target = allSuppliers.get(3);
        Purchaser homeGoods = allSuppliers.get(4);
        
        //Doing the same for furniture objects
        PassFurnitureBase chair = allFurniturePieces.get(0);
        PassFurnitureBase table = allFurniturePieces.get(1);
        PassFurnitureBase sofa = allFurniturePieces.get(2);
        PassFurnitureBase bed = allFurniturePieces.get(3);
        PassFurnitureBase wardrobe = allFurniturePieces.get(4);
    
        //Creating FurnitureCategory objects
        FurnitureCategory chairCategory = new FurnitureCategory("1", "Chair", 0.0, true, ikea);
        FurnitureCategory tableCategory = new FurnitureCategory("2", "Table", 0.0, true, walmart);
        FurnitureCategory sofaCategory = new FurnitureCategory("3", "Sofa", 0.0, false, westElm);
        FurnitureCategory bedCategory = new FurnitureCategory("4", "Bed", 0.0, false, target);
        FurnitureCategory wardrobeCategory = new FurnitureCategory("5", "Wardrobe", 0.0, false, homeGoods);
    
        //Adding orders to the list
        allCustomerOrders.add(chairCategory);
        allCustomerOrders.add(tableCategory);
        allCustomerOrders.add(sofaCategory);
        allCustomerOrders.add(bedCategory);
        allCustomerOrders.add(wardrobeCategory);
    
    }

    // Additional helper methods (optional)
    private PassFurnitureBase retrieveFurniture(int id) {
        return getFurnitureByID(id);
    }

    private Purchaser retrievePurchaser(int id) {
        return getPurchaserByID(id);
    }

    private FurnitureCategory retrieveCategory(int id) {
        return getCategoryByID(id);
    }

}
