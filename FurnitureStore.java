import java.util.*;

/**This class implements the FIRE FURNITUREInterface interface
 **/
public class FurnitureStore implements FURNITUREInterface // do not change this header

{
    private String storeName;
    private String location;

    //Collections to manage references
    public List<furnitureBase> allFurniturePieces;
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

    private void linkOrdersToFurniture() {
        for (FurnitureCategory order : allCustomerOrders) {
            furnitureBase furniturePiece = getFurnitureByID(order.getID());
            if (furniturePiece != null) {
                order.setFurnitureItem(furniturePiece);
            }
        }
    }

    // Implementation of the methods from FURNITURE interface
    @Override
    public void addFurniture(furnitureBase furniture) {
       allFurniturePieces.add(furniture.getID() -1, furniture);
    }

    @Override
    public void addPurchaser(Purchaser purchaser) {
        allSuppliers.add(purchaser.getID() -1, purchaser);
    }

    @Override
    public void addCategory(FurnitureCategory category) {
        allCustomerOrders.add(category.getID() -1, category);
    }

    @Override
    public furnitureBase getFurnitureByID(int id) {
        if (id>0 && id<allFurniturePieces.size()) {
            return allFurniturePieces.get(id-1); //-1 because of index in array list
        }
        return null; // Not found
    }

    @Override
    public Purchaser getPurchaserByID(int id) {
                if (id>0 && id<allSuppliers.size()) {
            return allSuppliers.get(id-1); //-1 because of index in array list
        }
        return null; // Not found
    }

    @Override
    public FurnitureCategory getCategoryByID(int id) {
                if (id>0 && id<allCustomerOrders.size()) {
            return allCustomerOrders.get(id-1); //-1 because of index in array list
        }
        return null; // Not found
    }

    // Private methods as specified
    private void loadFurnitureAndSuppliers() {
        // Logic to populate furnitureItems and suppliers
        // This may involve instantiating new FurnitureBase and Purchaser objects and adding them to the respective lists.
        
        //Creating furniture objects
        furnitureBase chair = new subFurnitureBase(1, "Chair", 1, 100.0);
        furnitureBase table = new subFurnitureBase(2, "Table", 1, 300.0);
        furnitureBase sofa = new subFurnitureBase(3, "Sofa", 1, 800);
        furnitureBase bed = new subFurnitureBase(4, "Bed", 1, 1200);
        furnitureBase wardrobe = new subFurnitureBase(5, "Wardrobe", 1, 900);
        
        // Adding furniture pieces to the collection based on their IDs
        allFurniturePieces.add(chair.getID() - 1, chair);
        allFurniturePieces.add(table.getID() - 1, table);
        allFurniturePieces.add(sofa.getID() - 1, sofa);
        allFurniturePieces.add(bed.getID() - 1, bed);
        allFurniturePieces.add(wardrobe.getID() - 1, wardrobe);
        
        //Creating Suppliers/Purchasers
        Date currentDate = new Date();
        Purchaser ikea = new Purchaser(1, "IKEA", "n/a", "ikea@example.com", currentDate);
        Purchaser walmart = new Purchaser(2, "Walmart", "n/a", "walmart@example.com", currentDate);
        Purchaser westElm = new Purchaser(3, "West Elm", "n/a", "westelm@example.com", currentDate);
        Purchaser target = new Purchaser(4, "Target", "n/a", "target@example.com", currentDate);
        Purchaser homeGoods = new Purchaser(5, "HomeGoods", "n/a", "homegoods@example.com", currentDate);
        
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
        furnitureBase chair = allFurniturePieces.get(0);
        furnitureBase table = allFurniturePieces.get(1);
        furnitureBase sofa = allFurniturePieces.get(2);
        furnitureBase bed = allFurniturePieces.get(3);
        furnitureBase wardrobe = allFurniturePieces.get(4);
    
        //Creating FurnitureCategory objects
        FurnitureCategory chairCategory = new FurnitureCategory(1, "Chair", 0.0, true, ikea, "101", 5);
        FurnitureCategory tableCategory = new FurnitureCategory(2, "Table", 0.0, true, walmart, "102", 3);
        FurnitureCategory sofaCategory = new FurnitureCategory(3, "Sofa", 0.0, false, westElm, "103", 2);
        FurnitureCategory bedCategory = new FurnitureCategory(4, "Bed", 0.0, false, target, "104", 1);
        FurnitureCategory wardrobeCategory = new FurnitureCategory(5, "Wardrobe", 0.0, false, homeGoods, "105", 4);
    
        //Adding orders to the list
        allCustomerOrders.add(chairCategory);
        allCustomerOrders.add(tableCategory);
        allCustomerOrders.add(sofaCategory);
        allCustomerOrders.add(bedCategory);
        allCustomerOrders.add(wardrobeCategory);
    }

    // Additional helper methods (optional)
    private furnitureBase retrieveFurniture(int id) {
        return getFurnitureByID(id);
    }

    private Purchaser retrievePurchaser(int id) {
        return getPurchaserByID(id);
    }

    private FurnitureCategory retrieveCategory(int id) {
        return getCategoryByID(id);
    }

}
