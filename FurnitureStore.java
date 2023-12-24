import java.util.*;

/**This class implements the FIRE FURNITUREInterface interface
 **/
public class FurnitureStore implements FURNITUREInterface // do not change this header

{
    private String storeName;
    private String location;

    //Collections to manage references
    public List<furnitureBase> allFurniturePieces;
    public List<FurnitureCategory> allSuppliers;
    public List<Purchaser> allCustomerOrders;
    
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
        for (Purchaser order : allCustomerOrders) {
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
        allCustomerOrders.add(purchaser.getID() -1, purchaser);
    }

    @Override
    public void addCategory(FurnitureCategory category) {
        allSuppliers.add(category.getID() -1, category);
    }

    @Override
    public furnitureBase getFurnitureByID(int id) {
        if (id>0 && id<=allFurniturePieces.size()) {
            return allFurniturePieces.get(id-1); //-1 because of index in array list
        }
        return null; // Not found
    }

    @Override
    public Purchaser getPurchaserByID(int id) {
                if (id>0 && id<=allCustomerOrders.size()) {
            return allCustomerOrders.get(id-1); 
        }
        return null; 
    }

    @Override
    public FurnitureCategory getCategoryByID(int id) {
                if (id>0 && id<=allSuppliers.size()) {
            return allSuppliers.get(id-1); 
        }
        return null; 
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
        allFurniturePieces.add(chair);
        allFurniturePieces.add(table);
        allFurniturePieces.add(sofa);
        allFurniturePieces.add(bed);
        allFurniturePieces.add(wardrobe);
        
        //Creating Suppliers/Furniture categories
        FurnitureCategory ikea = new FurnitureCategory (1, "IKEA", 0, false, null, "1", 1);
        FurnitureCategory walmart = new FurnitureCategory (2, "Walmart", 0, false, null, "2", 1);
        FurnitureCategory westElm = new FurnitureCategory (3, "West Elm", 0, false, null, "3", 1);
        FurnitureCategory target = new FurnitureCategory (4, "Target", 0, false, null, "4", 1);
        FurnitureCategory homeGoods = new FurnitureCategory (5, "HomeGoods", 0, false, null, "5", 1);
        
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
        
        //Declaring FurnitureCategory variables (linking object with the list)
        FurnitureCategory ikea = allSuppliers.get(0);
        FurnitureCategory walmart = allSuppliers.get(1);
        FurnitureCategory westElm = allSuppliers.get(2);
        FurnitureCategory target = allSuppliers.get(3);
        FurnitureCategory homeGoods = allSuppliers.get(4);
        
        //Doing the same for furniture objects
        furnitureBase chair = allFurniturePieces.get(0);
        furnitureBase table = allFurniturePieces.get(1);
        furnitureBase sofa = allFurniturePieces.get(2);
        furnitureBase bed = allFurniturePieces.get(3);
        furnitureBase wardrobe = allFurniturePieces.get(4);
    
        //Creating purchaser objects
        Purchaser chairOrder = new Purchaser(1, "Chair", "ChairType");
        Purchaser tableOrder = new Purchaser(2, "Table", "TableType");
        Purchaser sofaOrder = new Purchaser(3, "Sofa", "SofaType");
        Purchaser bedOrder = new Purchaser(4, "Bed", "BedType");
        Purchaser wardrobeOrder = new Purchaser(5, "Wardrobe", "WardrobeType");
    
        //Adding orders to the list
        allCustomerOrders.add(chairOrder);
        allCustomerOrders.add(tableOrder);
        allCustomerOrders.add(sofaOrder);
        allCustomerOrders.add(bedOrder);
        allCustomerOrders.add(wardrobeOrder);
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
