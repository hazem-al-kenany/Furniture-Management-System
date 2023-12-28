import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author 
 * @version 
 */

public class Tester{
    
// The doTest() method where you will write code to test your system
public void doTest() {
    FURNITUREInterface  homeFurnishingsDepot = new FurnitureStore("Home Furnishings Depot", "123 Furniture Street");
    Scanner enter = new Scanner(System.in);
     
     // Write all of your tests here
    homeFurnishingsDepot.addFurniture(new subFurnitureBase(1, "Chair", 4, 75.0));
    homeFurnishingsDepot.addFurniture(new subFurnitureBase(2, "Table", 3, 150.0));

    // Adding purchasers
    homeFurnishingsDepot.addPurchaser(new Purchaser(1, "Customer A", "Furniture Enthusiast"));
    homeFurnishingsDepot.addPurchaser(new Purchaser(2, "Customer B", "Homeowner"));

    // Adding categories
    homeFurnishingsDepot.addCategory(new FurnitureCategory(1, "Chair", 0.1, true, homeFurnishingsDepot.getPurchaserByID(1), "101", 5));
    homeFurnishingsDepot.addCategory(new FurnitureCategory(2, "Table", 0.15, true, homeFurnishingsDepot.getPurchaserByID(2), "102", 3));

    // Viewing furniture details
    System.out.println("Viewing furniture details:");
    furnitureBase chair = homeFurnishingsDepot.getFurnitureByID(1);
    if (chair != null) {
        System.out.println(chair.toString());
    }
    else {
        System.out.println("Furniture not found!");
    }

    // Viewing purchaser details
    System.out.println("\nViewing purchaser details:");
    Purchaser customerA = homeFurnishingsDepot.getPurchaserByID(1);
    if (customerA != null) {
        System.out.println("Name: " + customerA.getName());
        System.out.println("ID: " + customerA.getID());
        System.out.println("Contact Details: " + customerA.getContactDetails());
    }
    else {
        System.out.println("Purchaser not found!");
    }

    // Viewing category details
    System.out.println("\nViewing category details:");
    FurnitureCategory chairCategory = homeFurnishingsDepot.getCategoryByID(1);
    if (chairCategory != null) {
            System.out.println("Name: " + chairCategory.getTypeName());
            System.out.println("ID: " + chairCategory.getID());
            System.out.println("Max Load: " + chairCategory.getMaxLoad());
    }
    else {
        System.out.println("Category not found!");
    }
    
    //Testing OfficeFurniture
    System.out.println("\nOffice Furniture:");
    
    //Creating objects
    OfficeFurniture desk = new OfficeFurniture("Desk", true, "Wood", 300.0);
    OfficeFurniture deskchair = new OfficeFurniture("Desk Chair", false, "Metal", 250.0);
    
    //Testing OfficeFurniture methods
    System.out.println("Furniture Category: " + desk.getCategory()); //displays furnitureCategory of desk
    System.out.println("Ergonomic status: " + deskchair.isErgonomicFurniture()); //displays whether deskchair is ergonomic
    System.out.println("Material: " + desk.getMaterial()); //displays desk material
    
    System.out.println("Desk price: $" + desk.getPrice()); //displays deskchair price
    System.out.println("Deskchair price: $" + deskchair.getPrice()); //displays desk price
    
    
    //Testing price adjustment for both objects
    desk.adjustPrice(); //new expected price = 379.5 (10% is added since it is ergonomic, then 15% is added because it is wood)
    deskchair.adjustPrice(); // new expected price = 262.5 (5% is added becuse it is metal)
    
    //Viewing updated prices
    System.out.println("Desk updated price: $" + desk.getPrice());
    System.out.println("Deskchair updated price: $" + deskchair.getPrice());
    
    
    //Testing KidsSet
    System.out.println("\nKidsSet:");
    
    //Creating objects
    KidsSet fairyTaleCastleBed = new KidsSet("SET001", "Fairy Tale Bed", 750.0, "Fairy Tale Castle", 300.0);
    KidsSet dinosaurAdventureDesk = new KidsSet("SET002", "Dinosaur Adventure Desk", 499.99, "Dinosaur Adventure", 250.0);
    
    //Testing KidsSet methods
    System.out.println(fairyTaleCastleBed.setName + " price: $" + fairyTaleCastleBed.getPrice()); //displays Fairy Tale Castle price using getPrice
    dinosaurAdventureDesk.showPrice(); //displays Dinosaur Adventure set price using showPrice
    System.out.println(fairyTaleCastleBed.furName + " price: $" + fairyTaleCastleBed.getFurniturePrice()); //displays fairyTaleCastleBed price using getFurniturePrice
    
    //Testing mystery gift method
    System.out.println("Mystery gift for " + fairyTaleCastleBed.setName + " set: " + fairyTaleCastleBed.mysteryGift());//expected gift is Luxury Office Chair  
    System.out.println("Mystery gift for " + dinosaurAdventureDesk.setName + " set: " + dinosaurAdventureDesk.mysteryGift()); //expected gift is Desk Organizer Set
    
    //Testing special mystery gift method
    System.out.println("Special mystery gift for " + fairyTaleCastleBed.setName + " set: " + fairyTaleCastleBed.specialMysteryGift());
    System.out.println("Special mystery gift for " + dinosaurAdventureDesk.setName + " set: " + dinosaurAdventureDesk.specialMysteryGift());
}
    
    // Main method to make the class executable
    // No need to change this
public static void main(String[] args) {
        Tester tester = new Tester();
        tester.doTest();
}
}